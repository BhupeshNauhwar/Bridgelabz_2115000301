import java.util.*;

class Policy {
    private String policyNumber;
    private String holderName;
    private Date expiryDate;

    public Policy(String policyNumber, String holderName, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "{PolicyNumber: " + policyNumber + ", Holder: " + holderName + ", Expiry: " + expiryDate + "}";
    }
}

public class InsurancePolicyManagement1 {
    private Map<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<Date, Policy> sortedByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = cal.getTime();

        for (Map.Entry<Date, Policy> entry : sortedByExpiry.entrySet()) {
            if (entry.getKey().before(threshold)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getHolderName().equalsIgnoreCase(holderName)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = sortedByExpiry.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(now)) {
                policyMap.remove(entry.getValue().getPolicyNumber());
                orderedPolicies.remove(entry.getValue().getPolicyNumber());
                iterator.remove();
            }
        }
    }

    public void displayPolicies() {
        System.out.println("All Policies: " + orderedPolicies.values());
    }

    public static void main(String[] args) {
        InsurancePolicyManagement1 system = new InsurancePolicyManagement1(); // Fixed instantiation
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 10);
        system.addPolicy(new Policy("P1001", "Alice", cal.getTime()));

        cal.set(2025, Calendar.APRIL, 15);
        system.addPolicy(new Policy("P1002", "Bob", cal.getTime()));

        cal.set(2024, Calendar.FEBRUARY, 25);
        system.addPolicy(new Policy("P1003", "Alice", cal.getTime()));

        system.displayPolicies();
        System.out.println("Policy by Number (P1001): " + system.getPolicyByNumber("P1001"));
        System.out.println("Policies Expiring Soon: " + system.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + system.getPoliciesByHolder("Alice"));

        system.removeExpiredPolicies();
        System.out.println("Policies after removal:");
        system.displayPolicies(); 
    }
}

import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy policy = (InsurancePolicy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "Number='" + policyNumber + '\'' +
                ", Name='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Coverage='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManagement {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayPolicies(String setType) {
        Set<InsurancePolicy> policies;
        switch (setType.toLowerCase()) {
            case "hashset":
                policies = hashSetPolicies;
                break;
            case "linkedhashset":
                policies = linkedHashSetPolicies;
                break;
            case "treeset":
                policies = treeSetPolicies;
                break;
            default:
                return;
        }
        for (InsurancePolicy policy : policies) {
            System.out.println(policy);
        }
    }

    public void displayAllPolicies() {
        for (InsurancePolicy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date limitDate = cal.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(limitDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void displayDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }

    public void comparePerformance() {
        List<InsurancePolicy> samplePolicies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            samplePolicies.add(new InsurancePolicy("P" + i, "Holder" + i, new Date(System.currentTimeMillis() + i * 100000), "Auto", 1000 + i));
        }

        long startTime = System.nanoTime();
        Set<InsurancePolicy> testHashSet = new HashSet<>(samplePolicies);
        long endTime = System.nanoTime();
        System.out.println("HashSet Insertion Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        Set<InsurancePolicy> testLinkedHashSet = new LinkedHashSet<>(samplePolicies);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Insertion Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        Set<InsurancePolicy> testTreeSet = new TreeSet<>(samplePolicies);
        endTime = System.nanoTime();
        System.out.println("TreeSet Insertion Time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy(new InsurancePolicy("P1001", "Alice", new Date(2025 - 1900, 4, 20), "Health", 5000));
        system.addPolicy(new InsurancePolicy("P1002", "Bob", new Date(2024 - 1900, 10, 15), "Auto", 3000));
        system.addPolicy(new InsurancePolicy("P1003", "Charlie", new Date(2026 - 1900, 6, 10), "Home", 7000));
        system.addPolicy(new InsurancePolicy("P1004", "David", new Date(2024 - 1900, 9, 1), "Health", 4500));

        system.displayPolicies("hashset");
        system.displayPolicies("linkedhashset");
        system.displayPolicies("treeset");
        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Health");
        system.displayDuplicatePolicies();
        system.comparePerformance();
    }
}

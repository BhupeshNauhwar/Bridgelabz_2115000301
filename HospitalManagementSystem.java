class Patient{
    private static String  hospitalName="M.K Hospital";
    private static int totalPatients=0;
    private final int patientId;
    private String name;
    private String ailment;
    private int age;

    public Patient(int patientId,String name, String ailment, int age){
        this.patientId=patientId;
        this.name=name;
        this.ailment=ailment;
        this.age=age;
        totalPatients++;
    }
    public static void getTotalPatients(){
        System.out.println("Total Pateints:"+
        totalPatients);

    }
    public void display(){
        Patient.getTotalPatients();
        System.out.println("Pateint Id"+patientId);
        System.out.println("PAteitn Name:"+name);
        System.out.println("Ailment:"+ailment);
        System.out.println("Age:"+age+"\n");
    }
}

public class  HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1=new Patient(345, "Bhupesh","Allergies",34);
        
        
        if (p1 instanceof Patient) {
            p1.display();;
        }

        Patient p2=new Patient(876, "Xyz", "Headaches", 55);

       
        if (p2 instanceof Patient) {
            p2.display();
        }
        
    }
}

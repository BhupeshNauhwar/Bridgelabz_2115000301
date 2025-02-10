import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Alice", 45, "Pneumonia", 5, 2000));
        patients.add(new OutPatient(102, "Bob", 30, "Flu", 500));

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Initial diagnosis: " + patient.getDiagnosis());
                System.out.println("Medical Records: " + record.viewRecords());
            }
            System.out.println();
        }
    }
}

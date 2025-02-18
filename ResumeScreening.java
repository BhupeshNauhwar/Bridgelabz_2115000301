import java.util.*;

abstract class JobRole {
    public abstract void screenResume();
}

class SoftwareEngineer extends JobRole {
    @Override
    public void screenResume() {
        System.out.println("Screening Software Engineer Resume...");
    }
}

class DataScientist extends JobRole {
    @Override
    public void screenResume() {
        System.out.println("Screening Data Scientist Resume...");
    }
}

class ProductManager extends JobRole {
    @Override
    public void screenResume() {
        System.out.println("Screening Product Manager Resume...");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume of: " + candidateName);
        jobRole.screenResume();
    }
}

class ResumeScreening {
    public static <T extends JobRole> void screenAllResumes(List<Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.processResume();
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie", new ProductManager());

        List<Resume<? extends JobRole>> allResumes = List.of(seResume, dsResume, pmResume);

        System.out.println("Screening All Resumes:");
        screenAllResumes(allResumes);
    }
}

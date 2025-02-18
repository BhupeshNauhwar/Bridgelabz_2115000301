import java.util.*;

abstract class CourseType {
    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating Exam Course");
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating Assignment Course");
    }
}

class ResearchCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating Research Course");
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void evaluateCourse() {
        System.out.println("Course Name: " + courseName);
        courseType.evaluate();
    }
}

class CourseManager {
    public static void evaluateAllCourses(List<Course<?>> courses) {
        for (Course<?> c : courses) {
            c.evaluateCourse();
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> exam = new Course<>("Math", new ExamCourse());
        Course<AssignmentCourse> assignment = new Course<>("English", new AssignmentCourse());
        Course<ResearchCourse> research = new Course<>("Research", new ResearchCourse());
        
        exam.evaluateCourse();
        assignment.evaluateCourse();
        research.evaluateCourse();
        
        List<Course<? extends CourseType>> allCourse = List.of(exam, assignment, research);
        
        System.out.println("\nEvaluating All Courses Dynamically:");
        CourseManager.evaluateAllCourses(allCourse);
    }
}

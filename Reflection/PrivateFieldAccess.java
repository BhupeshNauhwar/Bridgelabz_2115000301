import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class PrivateFieldAccess {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            System.out.println("Original Age: " + ageField.getInt(person));

            ageField.set(person, 30);
            System.out.println("Modified Age: " + ageField.getInt(person));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

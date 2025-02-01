class Person{
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public Person(Person p){
        name=p.name;
        age=p.age;
        address=p.address;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address+"\n");
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p1=new Person("Bhupesh",24, "Mathura");
        Person p2=new Person(p1);
        System.out.println("Details using parameterisd constructor");
        p1.display();
        System.out.println("Details using copy constructor");
        p2.display();

    }
}

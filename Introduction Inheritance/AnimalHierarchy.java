class Animal{
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Sound of an Animal\n");
    }
    public void display(){
        System.out.println(name+" is "+ age+" years ");
    }
}
class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("SOund of dog\n");
        
    }
}
class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("SOund of cat\n");   
    }
}
class Bird extends Animal{

    public Bird(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("SOund of bird\n");
        
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog=new Dog("dog", 3);
        Animal cat=new Cat("cat", 2);
        Animal bird=new Bird("bird", 1);
        
        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();

        bird.display();
        bird.makeSound();


    }

    
}
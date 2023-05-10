package Homework.OOP;

public class Person {

    String fullName;
    int age;
    public void move(){
        System.out.println(fullName + " is moving");
    }

    public void talk(){
        System.out.println(fullName + " is talking");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person emptyPerson = new Person();
        emptyPerson.fullName = "Bob Vance";
        emptyPerson.age = 56;
        emptyPerson.talk();
        emptyPerson.move();
        Person personWithConstructor = new Person("Bob Ross", 45);
        personWithConstructor.move();
        personWithConstructor.talk();
    }
}

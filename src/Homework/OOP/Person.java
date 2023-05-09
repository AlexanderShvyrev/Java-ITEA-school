package Homework.OOP;

public class Person {

    String fullName;
    int age;
    static void move(String fullName){
        System.out.println(fullName + " is moving");
    }

    static void talk(String fullName){
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
        emptyPerson.talk(emptyPerson.fullName);
        emptyPerson.move(emptyPerson.fullName);
        Person personWithConstructor = new Person("Bob Ross", 45);
        personWithConstructor.move(personWithConstructor.fullName);
        personWithConstructor.talk(personWithConstructor.fullName);
    }
}

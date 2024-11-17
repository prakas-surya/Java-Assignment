package assignment;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 30, "123 Main Street");

        System.out.println("Person 1:");
        person1.displayDetails();

        System.out.println("\nPerson 2:");
        person2.displayDetails();

        System.out.println("\nPerson 3:");
        person3.displayDetails();
    }
}


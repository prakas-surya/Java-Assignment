package assignment;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = Not provided;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = Not provided;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println(Name  + name);
        System.out.println(Age  + (age  0  age  Not provided));
        System.out.println(Address  + address);
    }
}


package person;

public class Person {
    private final String name;
    private final int age;
    private final String street;

    public Person(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }
    public static PersonBuilder Builder = new PersonBuilder();
}

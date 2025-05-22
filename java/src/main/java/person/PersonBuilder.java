package person;

public class PersonBuilder {
    private String name;
    private int age;
    private String street;

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withStreetAddress(String street) {
        this.street = street;
        return this;
    }

    public Person build() {
        if (name == null || age < 0 || street == null)
            throw new IllegalArgumentException("Invalid person data: " + name + ", " + age + ", " + street);
        return new Person(name, age, street);
    }
}

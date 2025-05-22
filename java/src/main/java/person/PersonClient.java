package person;

public class PersonClient {

    public Person createPerson() {
        return Person.Builder.withName("Joe Bloggs")
                .withAge(42)
                .withStreetAddress("123 Main St")
                .build();
    }
}

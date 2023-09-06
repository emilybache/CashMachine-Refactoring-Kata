namespace Examples;

public class Person
{
    public readonly string Name;
    public readonly int Age;
    public readonly string Street;

    public Person(string name, int age, string street)
    {
        this.Name = name;
        this.Age = age;
        this.Street = street;
    }

    public static PersonBuilder Builder => new PersonBuilder();
}

public class PersonBuilder
{
    private string? name;
    private int? age;
    private string? street;

    public PersonBuilder WithName(string name)
    {
        this.name = name;
        return this;
    }

    public PersonBuilder WithAge(int age)
    {
        this.age = age;
        return this;
    }

    public PersonBuilder WithStreetAddress(string street)
    {
        this.street = street;
        return this;
    }

    public Person Build()
    {
        if (name == null || age == null || street == null)
            throw new InvalidOperationException("may not have a person with null fields");
        return new Person(name, age.Value, street);
    }
    
}

class PersonClient
{
    public Person CreatePerson()
    {
        return Person.Builder
            .WithName("Joe Bloggs")
            .WithAge(42)
            .WithStreetAddress("123 Main St.")
            .Build();
    }
}
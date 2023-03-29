package humans;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.setSurName(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.happyBirthday();
        return this;
    }

    public Person build() {
        return person;
    }
}

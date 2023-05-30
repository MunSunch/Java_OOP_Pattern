package humans;

import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    private String name;
    private String surName;
    private OptionalInt age;
    private Optional<String> address;

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = OptionalInt.of(age);
        this.address = Optional.of(address);
    }

    public boolean hasAge() {
        return age.isPresent();
    }

    public void happyBirthday() {
        age = OptionalInt.of(age.getAsInt()+1);
    }

    public boolean hasAddress() {
        return address.isPresent();
    }
    public void setAddress(String city) {
        address.map(oldCity -> oldCity=city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age.isPresent()? age.getAsInt(): 0;
    }

//    public String getAddress() {
//        return
//    }
}

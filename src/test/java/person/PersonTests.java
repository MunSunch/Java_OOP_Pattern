package person;

import humans.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTests {
    private Person person;

    @DisplayName("Возраст человека может быть неизвестен, в этом случае метод boolean hasAge() должен вернуть false, иначе - true")
    @Test
    public void testHasAge() {
        person = new Person();
        boolean expected = false;
        boolean actual = person.hasAge();
        Assertions.assertEquals(expected, actual);
    }
}

package adi.learn;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @Tag(TutorialClassificationConst.BOOLEAN_VALUES)
    void firstNameStartsWithJ() {
        Person person = new Person("John", "Doe");
        assertTrue(person.getFirstName().startsWith("J"));
    }

    @Test
    @Tag(TutorialClassificationConst.NULL_VALUES)
    void personHasFirstName() {
        Person person = new Person("John", "Doe");
        assertNotNull(person.getFirstName());
    }

    @Test
    @Tag(TutorialClassificationConst.OBJECTS_BY_VALUE)
    void personsAreSame() {
        Person john = new Person("John", "Doe");
        Person doe = new Person("John", "Doe");

        assertEquals(john, doe, "It don't match my guy ...");
    }

    // this is to test whether two instances are the exact same (i.e. same object in memory)
    @Test
    @Tag(TutorialClassificationConst.OBJECTS_BY_REFERENCE)
    void personsAreNotSameInstance() {
        Person john = new Person("John", "Doe");
        Person doe = new Person("John", "Doe");

        assertNotSame(john, doe);
    }

    @Test
    @Tag(TutorialClassificationConst.CUSTOM_ERROR_MESSAGES)
    void addingEmployeesToPersonnel() {
        Person employee = new Person("John", "Doe");

        Set<Person> personnel = new HashSet<>();
        personnel.add(employee);

        assertTrue(personnel.contains(employee),
                () -> String.format("Personnel file for %s was not found", employee));
    }

    @Test
    @Tag(TutorialClassificationConst.GROUPED_ASSERTIONS)
    void firstAndLastNameMatches() {
        Person person = new Person("John", "Doe");

        assertAll("person",
        () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName())
    );
    }


}
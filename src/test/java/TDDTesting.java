import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TDDTesting {

    @Test
    public void testIfNamesAreEqual() {
        String name = "Codeup";
        String input = "Codeup";

        assertEquals(name, input);
        assertNotEquals(name, input);
    }

    @Test
    public void testIfArrayListsAreEqual() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();


        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfStatementsAreEqual() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }



}

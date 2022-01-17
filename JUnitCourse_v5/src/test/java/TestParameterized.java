import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestParameterized {
    @ParameterizedTest
    @ValueSource(strings = {"3424", "42sfdfs", "hgf", "67uyr65"})
    void testLengthGreaterThanZero(String arg) {
        assertTrue(arg.length() > 3);
    }

    @ParameterizedTest
    @CsvSource({"QWERTY,qwerty", "12345,12345", " '' , '' "})
    void testToLowerCase(String arg, String lowered) {
        assertEquals(lowered, arg.toLowerCase(Locale.ROOT));
    }

    @ParameterizedTest(name = "The string {0} is {1} chars in length")
    @CsvFileSource(resources = "myFile.csv")
    void testToLowerCaseWithFile(String arg, int length) {
        assertEquals(length, arg.length());
    }
}

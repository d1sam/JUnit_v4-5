import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class NewAsserts {
    @Test
    void test() {
        List<String> actual = Arrays.asList("one", "two", "three");
        List<String> expected = new ArrayList<>(actual);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testLinesMatch() {
        List<String> actualLines = Arrays.asList("Happy New Year 2022!".split(" "));
        assertLinesMatch(Arrays.asList("Happy", "New", "Year", "2022!"), actualLines);
    }
}

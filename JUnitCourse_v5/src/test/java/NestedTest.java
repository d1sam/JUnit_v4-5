import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Outer Test")
class NestedTest {

    @BeforeAll
    static void setUpAllOuter() {
        System.out.println("--- before all in Outer---");
    }

    @BeforeEach
    void setUpEachOuter() {
        System.out.println("\tbefore each in Outer---");
    }

    @AfterAll
    static void tearDownAllOuter() {
        System.out.println("--- after all in Outer---");
    }

    @AfterEach
    void tearDownEachOuter() {
        System.out.println("\tafter each in Outer---");
    }

    @Test
    void testOuter1() {
        System.out.println("\t--- in testOuter1()");
    }

    @Test
    void testOuter2() {
        System.out.println("\t--- in testOuter2()");
    }


    @Nested
    @DisplayName("Nested ArrayList")
    class ArrayListRelatedTests {

        List<String> list;

        @BeforeEach
        void setUp() {
            System.out.println("\t\tbefore each in NestedAL");
            list = Arrays.asList("one", "two", "three");
        }

        @AfterEach
        void tearDown() {
            System.out.println("\t\tafter each in NestedAL");
        }

        @Test
        void testALNotNull() {
            System.out.println("\t\t--- in testALNotNull");
            assertNotNull(list);
        }

        @Test
        void testALSize() {
            System.out.println("\t\t--- in testALSize");
            assertEquals(3, list.size());
        }
    }

    @Nested
    @DisplayName("Nested TreeSet")
    class TreeSetRelatedTests {

        Set<String> set;

        @BeforeEach
        void setUp() {
            System.out.println("\t\tbefore each in NestedSet");
            set = new TreeSet(Arrays.asList("one", "two", "two"));
        }

        @AfterEach
        void tearDown() {
            System.out.println("\t\tafter each in NestedSet");
        }

        @Test
        void testSetNotNull() {
            System.out.println("\t\t--- in testSetNotNull");
            assertNotNull(set);
        }

        @Test
        void testSetSize() {
            System.out.println("\t\t--- in testSetSize");
            assertEquals(2, set.size());
        }
    }
}
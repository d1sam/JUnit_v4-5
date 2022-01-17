import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class TestSequence {
    @BeforeAll()
    static void initAll(TestInfo testInfo) {
//        System.out.println("before all tests");
        System.out.println("in " + testInfo.getDisplayName());
    }

    @AfterAll
    static void destroyAll(TestInfo testInfo) {
//        System.out.println("after all tests");
        System.out.println("in " + testInfo.getDisplayName());
    }

    @Test
    void test1(TestInfo testInfo) {
        System.out.println("in " + testInfo.getDisplayName());
    }

    @Test
    void test2(TestInfo testInfo) {
        System.out.println("in " + testInfo.getDisplayName());
    }

    @Test
    void test3(TestInfo testInfo) {
        System.out.println("in " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("When string is null, throw NPE")
    void testException() {
        String str = null;
        assertThrows(NullPointerException.class, () -> str.length());
    }

    @RepeatedTest(value = 5, name = "Repeated test")
    void testRepeated() {
        System.out.println("In testRepeated()");
    }
}


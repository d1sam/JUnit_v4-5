import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    // "  **" ---> "**",
    @Test
    public void testChopOff2SpacesAtHead_Both() {
        assertEquals("**", StringUtils.chopOff2SpacesAtHead("  **"));
    }

    // " **" ---> "**",
    @Test
    public void testChopOff2SpacesAtHead_Single() {
        assertEquals("**", StringUtils.chopOff2SpacesAtHead(" **"));
    }

    // "****" ---> "****",
    @Test
    public void testChopOff2SpacesAtHead_None() {
        assertEquals("****", StringUtils.chopOff2SpacesAtHead("****"));
    }

    // "**  " ---> "**  "
    @Test
    public void testChopOff2SpacesAtHead_BothAtRight() {
        assertEquals("**  ", StringUtils.chopOff2SpacesAtHead("**  "));
    }

    // "1234" --> false,
    @Test
    public void testAre2CharsAtHeadAndTailEqual_RandomNums() {
        assertFalse(utils.are2CharsAtHeadAndTailEqual("1234"));
    }

    // "1212" --> true,
    @Test
    public void testAre2CharsAtHeadAndTailEqual_NumsEqual() {
        assertTrue(utils.are2CharsAtHeadAndTailEqual("1212"));
    }

    // "12" --> true,
    @Test
    public void testAre2CharsAtHeadAndTailEqual_TwoNums() {
        assertTrue(utils.are2CharsAtHeadAndTailEqual("12"));
    }

    // "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_OneNum() {
        assertFalse(utils.are2CharsAtHeadAndTailEqual("1"));
    }
}

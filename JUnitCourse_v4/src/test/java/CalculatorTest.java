import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testEvaluate(){
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.evaluate("1+2+3"));
    }
}

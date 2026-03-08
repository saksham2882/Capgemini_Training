package test.java.com.cg;

import main.java.com.cg.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void calTest(){
        Calculator cal = new Calculator();

        // Test case 1:
        // assertEquals(10, cal.calculate(7, 4));

        // Test case 2:
        // assertEquals(10, cal.calculate(7, 3));
    }

    @Test
    @Timeout(2)      // test case executed under 2 millisecond
    public void isPrimeTest(){
        Calculator cal = new Calculator();
        // assertEquals(true, cal.isPrime(7));
        // assertEquals(false, cal.isPrime(4));
        // assertEquals(false, cal.isPrime(0));
        // assertEquals(false, cal.isPrime(1));
        // assertEquals(false, cal.isPrime(2));
        assertTrue(cal.isPrime(3));
        assertFalse(cal.isPrime(4));
    }
}

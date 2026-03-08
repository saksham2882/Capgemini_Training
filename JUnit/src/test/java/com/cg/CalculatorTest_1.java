package test.java.com.cg;

import main.java.com.cg.Calculator;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest_1 {

    Calculator cal;

    @BeforeEach
    public void init() {
        cal = new Calculator();
        System.out.println("Calculator Object Created");
    }


    @AfterEach
    public void destroy() {
        cal = null;
        System.out.println("Calculator Object Destroyed");
    }


    @Test
    @DisplayName(value = "Test calculate")
    public void calTest(){
        // Test case 1:
        // assertEquals(10, cal.calculate(7, 4));

        // Test case 2:
        System.out.println("Testing calculate method");
        assertEquals(10, cal.calculate(7, 3));
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
    // @Disabled
    public void isPrimeTest(int num){

        System.out.println("Testing isPrime method");
        // assertEquals(true, cal.isPrime(7));
        // assertEquals(false, cal.isPrime(4));
        // assertTrue(cal.isPrime(3));
        // assertFalse(cal.isPrime(4));
    }
}


// NOTE: also use "@BeforeAll" and "@AfterAll" to create all at a time, use static
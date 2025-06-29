import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done.");
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }

    // Test using Arrange-Act-Assert pattern
    @Test
    public void testAddition() {
 
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
    
        int a = 10;
        int b = 4;


        int result = calculator.subtract(a, b);

        
        assertEquals(6, result);
    }
}

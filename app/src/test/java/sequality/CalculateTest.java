package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test public void testSum(){
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2,3));
    }

    @Test public void testAAA(){
        Calculate calculate = new Calculate();
        String expected = "Sum of 2 and 3 is 5.Average is 2.5.";
        assertEquals(expected, calculate.AAA(2,3));
    }

    @Test public void testBBB(){
        Calculate calculate = new Calculate();
        String expected = "Sum of 1 to 10 is 55.Average is 5.5.";
        assertEquals(expected, calculate.BBB(1,10));
    }

    @Test public void testCCC(){
        Calculate calculate = new Calculate();
        String expected = "Sum of odd of 1 to 10 is 25.Sum of even is 30.";
        assertEquals(expected, calculate.CCC(1,10));
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTest {
    @Test
    public void testIsPrime1() {
        boolean output = Calculation.isPrime(-1);
        assertEquals(false, output);
    }

    @Test
    public void testIsPrime2() {
        boolean output = Calculation.isPrime(2);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime3() {
        boolean output = Calculation.isPrime(3);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime4() {
        boolean output = Calculation.isPrime(4);
        assertEquals(false, output);
    }

    @Test
    public void testIsPrime5() {
        boolean output = Calculation.isPrime(5);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime6() {
        boolean output = Calculation.isPrime(8);
        assertEquals(false, output);
    }
}
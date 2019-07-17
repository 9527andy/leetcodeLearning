package math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimesTest {
    CountPrimes countPrimes = null;

    @Before
    public void setup() {
        countPrimes = new CountPrimes();
    }

    /**
     * There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     */
    @Test
    public void countPrimes() {
        int actual = countPrimes.countPrimes(10);
        assertEquals(4, actual);
    }
}
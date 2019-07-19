package math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerThreeTest {
    PowerThree powerThree = null;

    @Before
    public void setUp() throws Exception {
        powerThree = new PowerThree();
    }

    @Test
    public void isPowerOfThree() {
        assertTrue(powerThree.isPowerOfThree(27));
        assertTrue(powerThree.isPowerOfThree(9));
        assertTrue(powerThree.isPowerOfThree(3));
        assertFalse(powerThree.isPowerOfThree(0));
        assertFalse(powerThree.isPowerOfThree(45));
        assertTrue(powerThree.isPowerOfThree(1));
        assertTrue(powerThree.isPowerOfThree(81));
    }
}
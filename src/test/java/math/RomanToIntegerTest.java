package math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {
    RomanToInteger romanToInteger = null;

    @Before
    public void setUp() throws Exception {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void romanToInt() {
        int return3 = romanToInteger.romanToInt("III");
        int return4 = romanToInteger.romanToInt("IV");
        int return9 = romanToInteger.romanToInt("IX");
        int return58 = romanToInteger.romanToInt("LVIII");
        int return1994 = romanToInteger.romanToInt("MCMXCIV");
        int return1476 = romanToInteger.romanToInt("MCDLXXVI");
        assertEquals(3, return3);
       assertEquals(4, return4);
        assertEquals(9, return9);
        assertEquals(58, return58);
        assertEquals(1994, return1994);
        assertEquals(1476, return1476);
    }
}
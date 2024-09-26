package string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
 ReverseInteger reverseInteger =null;
    @Before
    public void setUp() throws Exception {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void reverse() {
        int actual = reverseInteger.reverse(-1234);
        int actual2 = reverseInteger.reverse(1234);
        int actual3 = reverseInteger.reverse(463847412);
        int actual4= reverseInteger.reverse(-2147483412);
        int actual5= reverseInteger.reverse(1534236469);
        int actual6= reverseInteger.reverse(-1563847412);
        assertEquals(-4321,actual);
        assertEquals(4321,actual2);
        assertEquals(214748364,actual3);
        assertEquals(-2143847412,actual4);
        assertEquals(0,actual5);
        assertEquals(0,actual6);
    }
}
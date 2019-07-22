package string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    ReverseString reverseString = null;
    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {
        char[] input = {'h','e','l','l','o'};
        char[] output = {'o','l','l','e','h'};
        reverseString.reverseString(input);
        for (int i = 0;i<input.length;i++){
            assertEquals(input[i],output[i]);
        }
    }
}
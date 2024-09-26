package math;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = null;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzz() {
        String[] expectStr = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13", "14", "FizzBuzz"};
        List expect = Arrays.asList(expectStr);
        List actual = fizzBuzz.fizzBuzz(15);
        for (int i = 0; i<expectStr.length; i++){
            assertEquals(expect.get(i),actual.get(i));
        }
    }
}
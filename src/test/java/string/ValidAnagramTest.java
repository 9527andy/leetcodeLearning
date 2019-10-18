package string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {

    private ValidAnagram instance;

    @Before
    public void setUp() throws Exception {
        instance = new ValidAnagram();
    }

    @Test
    public void validAnagram() {
        String t1 = "anagram";
        String s1 = "nagaram";
        boolean r1 = instance.validAnagram(s1, t1);
        Assert.assertTrue(r1);

        String t2 = "rat";
        String s2 = "car";
        boolean r2 = instance.validAnagram(s2, t2);
        Assert.assertFalse(r2);
    }
}
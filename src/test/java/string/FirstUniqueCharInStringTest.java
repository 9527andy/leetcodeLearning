package string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FirstUniqueCharInStringTest {
    private FirstUniqueCharInString instance = null;
    private FirstUniqueCharInString1 instance1 = null;

    @Before
    public void setup() {
        instance = new FirstUniqueCharInString();
        instance1 = new FirstUniqueCharInString1();
    }

    @Test
    public void testFindFirstUniqueChar() {
        String s1 = "leetcode";
        int r1 = instance.findFirstUniqueChar(s1);
        Assert.assertEquals(0, r1);

        String s2 = "loveleetcode";
        int r2 = instance.findFirstUniqueChar(s2);
        Assert.assertEquals(2, r2);

        String s3 = "";
        int r3 = instance.findFirstUniqueChar(s3);
        Assert.assertEquals(-1, r3);

        String s4 = "cc";
        int r4 = instance.findFirstUniqueChar(s4);
        Assert.assertEquals(-1, r4);

        String s5 = "aadadaad";
        int r5 = instance.findFirstUniqueChar(s5);
        Assert.assertEquals(-1, r5);
    }

    @Test
    public void testFindFirstUniqueChar1() {
        String s1 = "leetcode";
        int r1 = instance1.findFirstUniqueChar(s1);
        Assert.assertEquals(0, r1);

        String s2 = "loveleetcode";
        int r2 = instance1.findFirstUniqueChar(s2);
        Assert.assertEquals(2, r2);

        String s3 = "";
        int r3 = instance1.findFirstUniqueChar(s3);
        Assert.assertEquals(-1, r3);

        String s4 = "cc";
        int r4 = instance1.findFirstUniqueChar(s4);
        Assert.assertEquals(-1, r4);

        String s5 = "aadadaad";
        int r5 = instance1.findFirstUniqueChar(s5);
        Assert.assertEquals(-1, r5);
    }

}
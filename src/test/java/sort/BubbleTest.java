package sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {
    Sort sort;
    String[] nums = new String[]{"4", "8", "2", "1","0"};

    @org.junit.Before
    public void setUp() throws Exception {
        sort = new Bubble();
    }

    @Test
    public void sort() {
        sort.sort(nums);

        String[] expecation = new String[]{"0", "1", "2", "4","8"};
        for (int i = 0; i < nums.length ; i++) {
            assertEquals(nums[i], expecation[i]);
        }
    }

    @Test(expected = NullPointerException.class)
    public void sortWithNull(){
        nums = null;
        sort.sort(nums);
    }
}
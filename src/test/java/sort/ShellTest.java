package sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShellTest {
    Sort sort;
    Integer[] nums = new Integer[]{13, 12, 11, 10,9, 8, 7, 6,5, 4, 3, 2,1,0};

    @Before
    public void setUp() throws Exception {
        sort = new Shell();
    }

    @Test
    public void sort() {
        sort.sort(nums);

        Integer[] expecation = new Integer[]{0, 1, 2, 3,4,5, 6, 7, 8,9,10,11,12,13};
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
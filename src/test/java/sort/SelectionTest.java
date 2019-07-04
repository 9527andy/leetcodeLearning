package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest {
    Selection selection;
    String[] nums = new String[]{"E", "A", "Z", "D","K","H"};

    @org.junit.Before
    public void setUp() throws Exception {
        selection = new Selection();
    }

    @org.junit.Test
    public void sort() {
        selection.sort(nums);

        String[] expecation = new String[]{"A", "D", "E", "H","K","Z"};
        for (int i = 0; i < nums.length ; i++) {
            assertEquals(nums[i],expecation[i]);
        }
    }

    @Test(expected = NullPointerException.class)
    public void sortWithNull(){
        nums = null;
        selection.sort(nums);
    }
}
package sort;

import java.util.Optional;

public class Shell<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        Optional.of(nums).orElseThrow(NullPointerException::new);

        int length = nums.length;
        int h = 1;

        while (h < length / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h ; j -= h) {
                    if (less(nums[j], nums[j - h])) {
                        swap(nums, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }
}

package sort;

import java.util.Optional;

/**
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * <p>
 * 4 8 2 1 0
 *
 * @param <T>
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        Optional.of(nums).orElseThrow(NullPointerException::new);

        int length = nums.length;

        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (less(nums[j + 1], nums[j])) {
                    swap(nums, j + 1, j);
                }
            }
        }
    }
}

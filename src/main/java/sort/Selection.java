package sort;

import java.util.Optional;

/**
 * 选择排序
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 假设第一个元素为最小，找到比假设的最小元素还小的元素替换下标，在第一次循环过后在交换元素。
 *
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 *
 * @param <T>
 */
public class Selection<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        Optional.of(nums).orElseThrow(NullPointerException::new);

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++){
                if (less(nums[j],nums[min])){
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        String[] nums = new String[]{"E", "A", "Z", "D","K","H"};
        selection.sort(nums);
    }
}

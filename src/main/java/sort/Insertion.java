package sort;

import java.util.Optional;

/**
 *  将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 *  从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 * @param <T>
 */
public class Insertion<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        Optional.of(nums).orElseThrow(NullPointerException::new);

        int length = nums.length;

        for (int i = 1; i<length; i++){
            for (int j = 0; j<i ; j++){
                if(less(nums[i],nums[j])){
                    T tmp = nums[i] ;
                    for(int k = i; k>0;k--) {
                        nums[k] = nums[k - 1];
                    }
                    nums[0]=tmp;
                }
            }
        }
    }

//    @Override
//    public void sort(T[] nums) {
//        int N = nums.length;
//        for (int i = 1; i < N; i++) {
//            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
//                swap(nums, j, j - 1);
//            }
//        }
//    }
}

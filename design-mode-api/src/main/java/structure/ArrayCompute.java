package structure;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;

/**
 * 数组运算
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/7/14 19:18
 */
public class ArrayCompute {
    /**
     * 二分查找
     *
     * @param nums 数组
     * @return 查询结果
     */
    public static int binarySearch(int[] nums,int left, int right, int search){
        if (null == nums || nums.length <= 0) {
            return -1;
        }
        int mid = (left+right)/2;
        while (left <= right) {
            if (nums[mid] == search) {
                return mid;
            } else if (nums[mid] > search) {
                left = mid -1;
            } else if (nums[mid] < search) {
                left = mid + 1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 45, 60, 79, 88, 100, 104, 200};
        int i = binarySearch(arr, 0, arr.length - 1, 100);
        System.out.println(i);
    }
}

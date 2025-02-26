package demo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangjiang on 2019/9/20.
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。示例 1:

 给定数组 nums = [1,1,2],

 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

 你不需要考虑数组中超出新长度后面的元素。
 示例 2:

 给定 nums = [0,0,1,1,1,2,2,3,3,4],

 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 你不需要考虑数组中超出新长度后面的元素。
 说明:
 */
public class SetArray {


    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        //int numbers=removeDuplicates(arr);
       int numbers=removeDuplicatesTwo(arr);
        System.out.println(numbers);

    }

    public static int removeDuplicates(int[] nums) {
        int number = 0;
        for(int i =0; i<nums.length;i++){
            // 相邻两个值比较，不同才做统计操作
            if(nums[i]!=nums[number]){
                number++;
                nums[number] = nums[i];
            }
        }
    // 不同数字为总量= number+1
        return ++number;
    }

    public static int removeDuplicatesTwo(int[] nums) {
        int num=0;
        Set set=new HashSet<>();
        for(int data: nums){
            boolean f=set.add(data);
            if(f){
                num++;
                nums[num] = data;
            }
        }
        return num;
    }
}

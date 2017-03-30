package leetcode.algorithms;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoubaochuan on 17/3/30.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        int index = 0;
        int length = nums.length;
        for(; i < length; i++) {
            for (j = i+1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        Integer[] res = (Integer[])list.toArray(new Integer[list.size()]);
        int[] result = new int[res.length];
        for (i = 0; i < res.length; i++){
            result[i] = res[i].intValue();
        }

         return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] index = solution.twoSum(nums, target);
        for (int i : index) {
            System.out.println(i);
        }
    }
}

package org.example;

import java.util.Arrays;

public class TwoSum {
    // https://leetcode.com/problems/two-sum/description/

    // 1. There was no need to the second function
    // 2. An additional loop in the first for block
    // 3. To print int[] use Array.toString()
    // 4. There was an unnecessary check for the first index
    // 5. Math could have been simplified, remainder doesn't need to be calculated

    public static int[] twoSum() {
        int[] nums = new int[]{10,15,7,2};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            int[] result = findElement(i, nums, target);
            if(result[1] != 0){
                return result;
            }
        }
        return new int[]{};
    }

    private static int[] findElement(int index, int[] nums, int target) {
        int[] result = new int[2];
        int remainder = target - nums[index];
        for (int i = index + 1; i < nums.length; i++) {
            if(remainder == nums[i]) {
                result[0] = index;
                result[1] = i;
                break;
            }
        }
        return result;
    }

}

package src;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Example 1: " + Arrays.toString(result1));


        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Example 2: " + Arrays.toString(result2));


        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Example 3: " + Arrays.toString(result3));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {

                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[0];
    }

}
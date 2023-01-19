package com.lg.algo.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

//1. Two Sum
//https://leetcode.com/problems/two-sum
public class TwoSum {
    public static void main(String[] args) {
        var twoSum = new TwoSum();

//        int[] nums = {2, 7, 11, 15};
//        int target = 9;

        int[] nums = {3, 2, 4};
        int target = 6;


        int[] indexes = twoSum.twoSum(nums, target);

        System.out.println(indexes);
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> values = new HashMap<>();
        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (values.get(nums[i]) != null && values.get(nums[i]) + nums[i] == target) {
                return new int[]{i, indexes.get(values.get(nums[i]))};
            }

            values.put(target - nums[i], nums[i]);
            indexes.put(nums[i], i);
        }
        return null;
    }
}

package com.lg.algo.leetcode.easy;

//27. Remove Element
//https://leetcode.com/problems/remove-element/description/
public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement.removeElement(nums, val));
        System.out.println(removeElement.removeElementOptimized(nums, val));
    }

    public int removeElementOptimized(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        int repeat = 0;
        int[] copy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                repeat++;
            } else {
                copy[index++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) nums[i] = copy[i];

        return nums.length - repeat;
    }
}

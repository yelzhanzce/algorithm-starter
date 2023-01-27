package com.lg.algo.leetcode.easy;

//1299. Replace Elements with Greatest Element on Right Side
public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide rightSide = new ReplaceElementsWithGreatestElementOnRightSide();

        int[] arr = {17, 18, 5, 4, 6, 1};

        int[] ints = rightSide.replaceElements(arr);

        System.out.println(ints);
    }

    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        for (int i = 0; i < arr.length; i++) {

            int max = arr[arr.length - 1];

            for (int j = arr.length - 2; j > i; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }

}

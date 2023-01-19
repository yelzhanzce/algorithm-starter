package com.lg.algo.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 6, 7, 8, 10, 15, 18};
        int i = binarySearch(list, 2);
        System.out.println("index = " + i);
    }

    public static int binarySearch(int[] list, int target){
        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int mid = (low + high)/2;
            int guess = list[mid];

            if (guess == target)
                return mid;
            if(guess > target)
                high = mid - 1;
            if (guess < target)
                low = mid + 1;
        }
        return -1;
    }
}

package com.lg.algo.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle
public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();

        System.out.println(pascalsTriangle.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        result.add(integer);

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = result.get(result.size() - 1);
            List<Integer> prevRow = temp;
            prevRow.add(prevRow.set(0, 0));
            prevRow.add(prevRow.size(), 0);

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < prevRow.size() - 1; j++) {
                row.add(j, prevRow.get(j) + prevRow.get(j+1));
            }

            result.add(row);
        }

        return result;
    }
}

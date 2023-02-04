package com.lg.algo.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(result.size() - 1);

            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(prevRow);
            temp.add(temp.size(), 0);

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < temp.size() - 1; j++) {
                row.add(j, temp.get(j) + temp.get(j + 1));
            }

            result.add(row);
        }

        return result;
    }
}

package com.lg.algo.leetcode.easy;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle
=======
import java.util.List;

//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/
>>>>>>> a4c9494bc04c8de90331c680ac35d45c0e5535a8
public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
<<<<<<< HEAD

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
=======
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
>>>>>>> a4c9494bc04c8de90331c680ac35d45c0e5535a8
            }

            result.add(row);
        }

        return result;
    }
}

package com.lg.algo.leetcode.easy;

//392. Is Subsequence
//https://leetcode.com/problems/is-subsequence
public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();

        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence.isSubsequence(s, t));
        System.out.println(isSubsequence.isSubsequenceShorter(s, t));
    }

    public boolean isSubsequenceShorter(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        if (s.length() == i) return true;

        return false;
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        String word = "";

        for (int i = 0, index = 1; i < t.length(); i++) {
            word += t.charAt(i);

            if (s.substring(0, index).equals(word)) {
                index++;
            } else {
                word = word.substring(0, word.length() - 1);
            }

            if (s.equals(word)) return true;
        }

        return false;
    }
}

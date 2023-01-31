package com.lg.algo.leetcode.easy;

//58. Length of Last Word
//https://leetcode.com/problems/length-of-last-word
public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        boolean isNotFirstSpace = false;
        int size = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && isNotFirstSpace) break;

            if (!(s.charAt(i) == ' ')) {
                size++;
                isNotFirstSpace = true;
            }
        }

        return size;
    }

}

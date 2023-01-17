package com.lg.algo.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"ab", "a"};
//        String[] strs = {"aaba","aaa","aa","aa","aa"};
        String[] strs = {"abca","aba","aaab"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for(int i = 0; i < strs.length - 1; i++) {
            String wordNext = strs[i+1];

            int minOfThem = Math.min(wordNext.length(), word.length());
            String substringWord = word.substring(0, minOfThem);
            String substringWordNext = wordNext.substring(0, minOfThem);

            if (!substringWord.equals(substringWordNext)) {
                boolean isAnyMatch = false;
                for(int j = minOfThem; j > 0; j--) {
                    String subFirst = word.substring(0, j);
                    String subSecond = wordNext.substring(0, j);
                    if (subFirst.equals(subSecond)) {
                        word = subFirst;
                        isAnyMatch = true;
                        break;
                    }
                }

                if (!isAnyMatch) {
                    word = "";
                    break;
                }
            } else {
                word = substringWord;
            }
        }

        return word;
    }
}

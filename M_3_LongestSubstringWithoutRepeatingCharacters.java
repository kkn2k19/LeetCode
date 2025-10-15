// 16.10.2025
// http://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// 3. Longest Substring Without Repeating Characters

import java.util.*;

public class M_3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start += 1;
            }
            set.add(ch);
            max = Math.max(max, end - start + 1);
            end += 1;
        }
        return max;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3_LongestSubstringWithoutRepeatingCharacters.java && java
// M_3_LongestSubstringWithoutRepeatingCharacters && del
// M_3_LongestSubstringWithoutRepeatingCharacters.class
// 3
// 1
// 3
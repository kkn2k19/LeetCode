// 13.10.2025
// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/?envType=daily-question&envId=2025-10-13
// 2273. Find Resultant Array After Removing Anagrams

import java.util.*;

public class E_2273_FindResultantArrayAfterRemovingAnagrams {
    public static boolean isAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (res.isEmpty() || !isAnagrams(res.get(res.size() - 1), w)) {
                res.add(w); // if last list ele and w is not anagram then add w to list
                            // means this two last ele and w are not adjacent anagrams
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words1 = { "abba", "baba", "bbaa", "cd", "cd" };
        System.out.println(removeAnagrams(words1));

        String[] words2 = { "a", "b", "c", "d", "e" };
        System.out.println(removeAnagrams(words2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2273_FindResultantArrayAfterRemovingAnagrams.java && java
// E_2273_FindResultantArrayAfterRemovingAnagrams && del
// E_2273_FindResultantArrayAfterRemovingAnagrams.class
// [abba, cd]
// [a, b, c, d, e]
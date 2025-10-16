// 16.10.2025
// https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-10-16
// 2942. Find Words Containing Character

import java.util.*;

public class E_2942_FindWordsContainingCharacter {
    public static boolean containsX(String s, char x) {
        // char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x)
                return true;
        }
        return false;
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for (String word : words) {
            if (containsX(word, x))
                list.add(i);
            i += 1;
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words1 = { "leet", "code" };
        char x1 = 'e';
        System.out.println(findWordsContaining(words1, x1));

        String[] words2 = { "abc", "bcd", "aaaa", "cbc" };
        char x2 = 'a';
        System.out.println(findWordsContaining(words2, x2));

        String[] words3 = { "abc", "bcd", "aaaa", "cbc" };
        char x3 = 'z';
        System.out.println(findWordsContaining(words3, x3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2942_FindWordsContainingCharacter.java && java
// E_2942_FindWordsContainingCharacter && del
// E_2942_FindWordsContainingCharacter.class
// [0, 1]
// [0, 2]
// []
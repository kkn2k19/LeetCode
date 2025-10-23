// 24.10.2025
// https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-10-23
// 3136. Valid Word

import java.util.*;

public class E_3136_ValidWord {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    hasVowel = true;
                } else if (Character.isLetter(ch)) {
                    hasConsonant = true;
                }
            } else {
                return false; // other than digit or letter found
            }
        }

        return hasVowel && hasConsonant;
    }

    public static void main(String[] args) {
        String word1 = "234Adas";
        System.out.println(isValid(word1));

        String word2 = "b3";
        System.out.println(isValid(word2));

        String word3 = "a3$e";
        System.out.println(isValid(word3));

        String word4 = "A1b";
        System.out.println(isValid(word4));

        String word5 = "123";
        System.out.println(isValid(word5));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3136_ValidWord.java && java E_3136_ValidWord && del E_3136_ValidWord.class
// true
// false
// false
// true
// false
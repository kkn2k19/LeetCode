// 12.10.2025
// https://leetcode.com/problems/sort-vowels-in-a-string/?envType=daily-question&envId=2025-10-12
// 2785. Sort Vowels in a String

import java.util.*;

public class M_2785_SortVowelsInAString {
    public static boolean isVowel(char ch) {
        // if (ch == 'a' || ch == 'A'
        //         || ch == 'e' || ch == 'E'
        //         || ch == 'i' || ch == 'I'
        //         || ch == 'o' || ch == 'O'
        //         || ch == 'u' || ch == 'U')
        //     return true;
        // return false;
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (isVowel(ch))
                list.add(ch);
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = list.get(index);
                index += 1;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s1 = "lEetcOde";
        System.out.println(sortVowels(s1));

        String s2 = "lYmpH";
        System.out.println(sortVowels(s2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac M_2785_SortVowelsInAString.java && java M_2785_SortVowelsInAString && del M_2785_SortVowelsInAString.class
// lEOtcede
// lYmpH
// 24.10.2025
// https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2025-10-23
// 1957. Delete Characters to Make Fancy String

import java.util.*;

public class E_1957_DeleteCharactersToMakeFancyString {
    public static String makeFancyString(String s) {
        if (s.length() < 3)
            return s;
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for (int i = 2; i < s.length(); i++) {
            if (!(
                    (s.charAt(i) == sb.charAt(sb.length() - 1))
                    && (s.charAt(i) == sb.charAt(sb.length() - 2))
                )) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "leeetcode";
        System.out.println(makeFancyString(s1));

        String s2 = "aaabaaaa";
        System.out.println(makeFancyString(s2));

        String s3 = "aab";
        System.out.println(makeFancyString(s3));

        String s4 = "aaa";
        System.out.println(makeFancyString(s4));
    }
}


// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac E_1957_DeleteCharactersToMakeFancyString.java && java E_1957_DeleteCharactersToMakeFancyString && del E_1957_DeleteCharactersToMakeFancyString.class
// leetcode
// aabaa
// aab
// aa

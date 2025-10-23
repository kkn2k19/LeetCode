// 24.10.2025
// https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23
// 3461. Check If Digits Are Equal in String After Operations I

import java.util.*;

public class E_3461_CheckIfDigitsAreEqualInStringAfterOperationsI {
    public static boolean isDigitsSum(String s) {
        return s.charAt(0) == s.charAt(1);
    }

    public static String consecutiveDigitsSum(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i < s.length(); i++) {
            int sum = (s.charAt(i - 1) - '0') + (s.charAt(i) - '0');
            sb.append(sum % 10);
        }
        return sb.toString();
    }

    public static boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            s = consecutiveDigitsSum(s);
        }
        if (s.length() == 2) {
            if (isDigitsSum(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "3902";
        System.out.println(hasSameDigits(s1));

        String s2 = "34789";
        System.out.println(hasSameDigits(s2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3461_CheckIfDigitsAreEqualInStringAfterOperationsI.java && java
// E_3461_CheckIfDigitsAreEqualInStringAfterOperationsI && del
// E_3461_CheckIfDigitsAreEqualInStringAfterOperationsI.class
// true
// false
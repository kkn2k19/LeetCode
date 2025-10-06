// 29.01.2025
// https://leetcode.com/problems/replace-all-digits-with-characters/
// 1844. Replace All Digits with Characters

// You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
// You must perform an operation shift(c, x), where c is a character and x is a digit, that returns the xth character after c.
// For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
// For every odd index i, you want to replace the digit s[i] with the result of the shift(s[i-1], s[i]) operation.
// Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
// Note that shift(c, x) is not a preloaded function, but an operation to be implemented as part of the solution.

// Example 1:
// Input: s = "a1c1e1"
// Output: "abcdef"
// Explanation: The digits are replaced as follows:
// - s[1] -> shift('a',1) = 'b'
// - s[3] -> shift('c',1) = 'd'
// - s[5] -> shift('e',1) = 'f'

// Example 2:
// Input: s = "a1b2c3d4e"
// Output: "abbdcfdhe"
// Explanation: The digits are replaced as follows:
// - s[1] -> shift('a',1) = 'b'
// - s[3] -> shift('b',2) = 'd'
// - s[5] -> shift('c',3) = 'f'
// - s[7] -> shift('d',4) = 'h'

import java.util.Scanner;
// import java.util.Arrays;

public class E_1844_ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(replaceDigits(str));
    }

    public static String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                char ch = (char) (s.charAt(i - 1) + (s.charAt(i) - '0')); // s(i) - '0'// '0' has ASCII = 48 which shows
                                                                          // s(i) - '0' automatically converts it to
                                                                          // ASCII and then int value
                // '3' - '0' → 51 - 48 → 3 (integer)
                // s(i-1) + this 3 // since int >> char so s(i-1) will convert to int (ASCII)
                // and add then convert to char
                str.append(ch);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}

// OUTPUT ---
// Enter a String : a1b2c3d4e
// abbdcfdhe

// Enter a String : a1c1e1
// abcdef
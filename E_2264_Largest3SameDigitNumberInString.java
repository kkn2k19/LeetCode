// 23.10.2025
// https://leetcode.com/problems/largest-3-same-digit-number-in-string/?envType=daily-question&envId=2025-10-22
// 2264. Largest 3-Same-Digit Number in String

public class E_2264_Largest3SameDigitNumberInString {
    public static boolean containsUnique(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i))
                return false;
        }
        return true;
    }

    public static String largestGoodInteger(String num) {
        String s = "";
        int n = num.length();
        int k = 3;
        int digit = -1;
        for (int i = 0; i <= n - k; i++) {
            if (containsUnique(num.substring(i, i + k))) {
                if (s.equals("")) {
                    s = num.substring(i, i + k);
                    digit = num.charAt(i) - '0';
                }
                if ((num.charAt(i) - '0') > digit) {
                    s = num.substring(i, i + k);
                    digit = num.charAt(i) - '0';
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String num1 = "6777133339";
        System.out.println(largestGoodInteger(num1));

        String num2 = "2300019";
        System.out.println(largestGoodInteger(num2));

        String num3 = "42352338";
        System.out.println(largestGoodInteger(num3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2264_Largest3SameDigitNumberInString.java && java
// E_2264_Largest3SameDigitNumberInString && del
// E_2264_Largest3SameDigitNumberInString.class
// 777
// 000

// 14.10.2025
// https://leetcode.com/problems/longest-palindromic-substring/description/
// 5. Longest Palindromic Substring

public class M_5_LongestPalindromicSubstring {
    public static boolean isPalindrome(String s) {
        // char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            // if (arr[start] != arr[end]) return false;
            if (s.charAt(start) != s.charAt(end))
                return false;
            start += 1;
            end -= 1;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substr = s.substring(i, j + 1);
                if (isPalindrome(substr) && substr.length() > longest.length())
                    longest = substr;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String s1 = "babad";
        System.out.println(longestPalindrome(s1));

        String s2 = "cbbd";
        System.out.println(longestPalindrome(s2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_5_LongestPalindromicSubstring.java && java M_5_LongestPalindromicSubstring
// && del M_5_LongestPalindromicSubstring.class
// bab
// bb

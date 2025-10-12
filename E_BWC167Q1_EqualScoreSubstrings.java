// 12.10.2025
// https://leetcode.com/contest/biweekly-contest-167/problems/equal-score-substrings/description/
// Q1. Equal Score Substrings

public class E_BWC167Q1_EqualScoreSubstrings {
    public static boolean scoreBalance(String s) {
        int totalSum = 0;
        for (char ch : s.toCharArray()) {
            totalSum += (ch - 'a' + 1); // a-a = 0 but we have to take a = 1
        }

        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            lSum += (ch - 'a' + 1);
            rSum = totalSum - lSum;
            if (lSum == rSum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "adcb";
        System.out.println(scoreBalance(s1));

        String s2 = "bace";
        System.out.println(scoreBalance(s2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_BWC167Q1_EqualScoreSubstrings.java && java E_BWC167Q1_EqualScoreSubstrings
// && del E_BWC167Q1_EqualScoreSubstrings.class
// true
// false
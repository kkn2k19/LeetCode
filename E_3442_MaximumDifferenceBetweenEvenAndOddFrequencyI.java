// 16.10.2025
// http://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-10-16
// 3442. Maximum Difference Between Even and Odd Frequency I

import java.util.*;

public class E_3442_MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        // int maxEven = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        // int minOdd = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f == 0)
                continue;
            if (f % 2 == 0) {
                // maxEven = Math.max(maxEven, f);
                minEven = Math.min(minEven, f);
            } else {
                // minOdd = Math.min(minOdd, f);
                maxOdd = Math.max(maxOdd, f);
            }
        }
        // if (maxEven == Integer.MIN_VALUE || minOdd == Integer.MAX_VALUE)
        // return 0; // one of them not exists
        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE)
            return 0;
        // return Math.max(maxEven - minOdd, maxOdd - minEven);
        return maxOdd - minEven; // only odd - even asked here
    }

    public static void main(String[] args) {
        String s1 = "aaaaabbc";
        System.out.println(maxDifference(s1));

        String s2 = "abcabcab";
        System.out.println(maxDifference(s2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3442_MaximumDifferenceBetweenEvenAndOddFrequencyI.java && java
// E_3442_MaximumDifferenceBetweenEvenAndOddFrequencyI && del
// E_3442_MaximumDifferenceBetweenEvenAndOddFrequencyI.class
// 3
// 1
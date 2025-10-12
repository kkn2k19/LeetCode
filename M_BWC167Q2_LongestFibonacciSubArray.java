// 12.10.2025
// https://leetcode.com/contest/biweekly-contest-167/problems/equal-score-substrings/description/
// Q1. Equal Score Substrings

public class M_BWC167Q2_LongestFibonacciSubArray {
    public static int longestSubarray(int[] nums) {
        if (nums.length < 3)
            return nums.length;
        // int start = 2;
        // int end = 2;
        // while (start < nums.length) {
        //     if (nums[end] == (nums[end - 1] + nums[end - 2]))
        //         end += 1;
        //     else {
        //         start = end + 1;
        //         end = start;
        //     }
        // }
        // return (end - start + 1);

        int len = 2;
        int max = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1] + nums[i - 2])) {
                len += 1;
            } else {
                len = 2; // reset to 2
            }
            max = Math.max(len, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 1, 1, 2, 3, 5, 1 };
        System.out.println(longestSubarray(nums1));

        int[] nums2 = { 5, 2, 7, 9, 16 };
        System.out.println(longestSubarray(nums2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac M_BWC167Q2_LongestFibonacciSubArray.java && java M_BWC167Q2_LongestFibonacciSubArray && del M_BWC167Q2_LongestFibonacciSubArray.class
// 5
// 5
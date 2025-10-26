// 27.10.2025
// https://leetcode.com/problems/maximum-alternating-sum-of-squares/description/
// 3727. Maximum Alternating Sum of Squares

import java.util.*;

public class M_3727_MaximumAlternatingSumOfSquares {
    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int start = 0, end = n - 1;
        long sum = 0;
        while (start < end) {
            sum += (nums[end] * nums[end]);
            end -= 1;
            sum -= (nums[start] * nums[start]);
            start += 1;
        }
        if (start == end) {
            sum += (nums[start] * nums[start]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        System.out.println(maxAlternatingSum(nums1));

        int[] nums2 = { 1, -1, 2, -2, 3, -3 };
        System.out.println(maxAlternatingSum(nums2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3727_MaximumAlternatingSumOfSquares.java && java
// M_3727_MaximumAlternatingSumOfSquares && del
// M_3727_MaximumAlternatingSumOfSquares.class
// 12
// 16
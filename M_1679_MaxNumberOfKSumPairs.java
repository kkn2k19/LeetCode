// 10.10.2025
// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
// 1679. Max Number of K-Sum Pairs

import java.util.Arrays;

public class M_1679_MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int count = 0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                count += 1;
                start += 1;
                end -= 1;
            } else if (sum < k)
                start += 1;
            else
                end -= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int k1 = 5;
        System.out.println(maxOperations(nums1, k1));

        int[] nums2 = { 3, 1, 3, 4, 3 };
        int k2 = 6;
        System.out.println(maxOperations(nums2, k2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_1679_MaxNumberOfKSumPairs.java && java M_1679_MaxNumberOfKSumPairs && del
// M_1679_MaxNumberOfKSumPairs.class
// 2
// 1
// 20.10.2025
// https://leetcode.com/contest/weekly-contest-472/problems/longest-balanced-subarray-i/description/
// Q2. Longest Balanced Subarray I

import java.util.*;

public class M_WC472Q2_LongestBalancedSubarrayI {
    public static int longestBalanced(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> evens = new HashSet<>();
            HashSet<Integer> odds = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evens.add(nums[j]);
                } else {
                    odds.add(nums[j]);
                }
                if (evens.size() == odds.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 5, 4, 3 };
        System.out.println(longestBalanced(nums1));

        int[] nums2 = { 3, 2, 2, 5, 4 };
        System.out.println(longestBalanced(nums2));

        int[] nums3 = { 1, 2, 3, 2 };
        System.out.println(longestBalanced(nums3));
    }
}

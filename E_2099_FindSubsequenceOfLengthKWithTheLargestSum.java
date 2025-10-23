// 24.10.2025
// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/?envType=daily-question&envId=2025-10-23
// 2099. Find Subsequence of Length K With the Largest Sum

import java.util.*;

public class E_2099_FindSubsequenceOfLengthKWithTheLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums, n);
        Arrays.sort(arr);
        int maxSum = Integer.MIN_VALUE;

        // last k ele will always have the maxSum so just take it
        // Set<Integer> setTopK = new HashSet<>(); // instead of set take list to allow
        // duplicate ele
        List<Integer> listTopK = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            maxSum += arr[i];
            listTopK.add(arr[i]);
        }

        int[] res = new int[k];

        int index = 0;
        for (int i = 0; i < n && index < k; i++) {
            if (listTopK.contains(nums[i])) {
                res[index] = nums[i];
                index += 1;
                listTopK.remove((Integer) nums[i]); // remove one occurence of this ele
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 1, 3, 3 };
        int k1 = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums1, k1)));

        int[] nums2 = { -1, -2, 3, 4 };
        int k2 = 3;
        System.out.println(Arrays.toString(maxSubsequence(nums2, k2)));

        int[] nums3 = { 3, 4, 3, 3 };
        int k3 = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums3, k3)));

        int[] nums4 = { 50, -75 };
        int k4 = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums4, k4)));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2099_FindSubsequenceOfLengthKWithTheLargestSum.java && java
// E_2099_FindSubsequenceOfLengthKWithTheLargestSum && del
// E_2099_FindSubsequenceOfLengthKWithTheLargestSum.class
// [3, 3]
// [-1, 3, 4]
// [3, 4]
// [50, -75]
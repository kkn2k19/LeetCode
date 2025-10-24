// 25.10.2025
// https://leetcode.com/problems/number-of-zero-filled-subarrays/?envType=daily-question&envId=2025-10-24
// 2348. Number of Zero-Filled Subarrays

import java.util.*;

public class M_2348_NumberOfZeroFilledSubarrays {
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long len = 0;

        for (int num : nums) {
            if (num == 0) {
                len += 1;
                count += len;
            } else {
                len = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 0, 0, 2, 0, 0, 4 };
        System.out.println(zeroFilledSubarray(nums1));

        int[] nums2 = { 0, 0, 0, 2, 0, 0 };
        System.out.println(zeroFilledSubarray(nums2));

        int[] nums3 = { 2, 10, 2019 };
        System.out.println(zeroFilledSubarray(nums3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2348_NumberOfZeroFilledSubarrays.java && java
// M_2348_NumberOfZeroFilledSubarrays && del
// M_2348_NumberOfZeroFilledSubarrays.class
// 6
// 9
// 0

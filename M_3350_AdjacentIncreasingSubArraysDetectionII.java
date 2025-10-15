// 15.10.2025
// https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/?envType=daily-question&envId=2025-10-15
// 3350. Adjacent Increasing Subarrays Detection II

import java.util.*;

public class M_3350_AdjacentIncreasingSubArraysDetectionII {
    public static boolean isIncreasing(List<Integer> nums, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1))
                return false;
        }
        return true;
    }

    public static int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int max = 0;
        for (int k = 1; k * 2 <= n; k++) {
            boolean found = false;
            // part 1 = i to i+k-1 -- i+k -> i+k not included
            // part 2 = i+k to i+2*k - 1 --> i+2*k not included
            for (int i = 0; i + 2 * k - 1 < n; i++) {
                if (isIncreasing(nums, i, i + k) && isIncreasing(nums, i + k, i + 2 * k)) {
                    found = true;
                    break;
                }
            }
            if (found)
                max = k;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        System.out.println(maxIncreasingSubarrays(nums1));

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        System.out.println(maxIncreasingSubarrays(nums2));
    }
}

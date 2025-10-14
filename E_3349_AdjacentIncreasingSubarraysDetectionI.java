// 15.10.2025
// https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/?envType=daily-question&envId=2025-10-14
// 3349. Adjacent Increasing Subarrays Detection I

import java.util.*;

public class E_3349_AdjacentIncreasingSubarraysDetectionI {
    public static boolean isIncreasing(List<Integer> nums, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1))
                return false;
        }
        return true;
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        // part 1 = i to i+k-1 -- i+k -> i+k not included
        // part 2 = i+k to i+2*k - 1 --> i+2*k not included
        for (int i = 0; i + 2 * k <= n; i++) {
            if (isIncreasing(nums, i, i + k) && isIncreasing(nums, i + k, i + 2 * k))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        int k1 = 3;
        System.out.println(hasIncreasingSubarrays(nums1, k1));

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        int k2 = 5;
        System.out.println(hasIncreasingSubarrays(nums2, k2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3349_AdjacentIncreasingSubarraysDetectionI.java && java
// E_3349_AdjacentIncreasingSubarraysDetectionI && del
// E_3349_AdjacentIncreasingSubarraysDetectionI.class
// true
// false
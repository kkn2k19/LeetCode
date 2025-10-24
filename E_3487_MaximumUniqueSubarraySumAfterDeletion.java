// 25.10.2025
// https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/?envType=daily-question&envId=2025-10-24
// 3487. Maximum Unique Subarray Sum After Deletion

import java.util.*;

public class E_3487_MaximumUniqueSubarraySumAfterDeletion {
    public static int maxSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0)
                sum = 0;
            if (nums[i] != nums[i - 1]) {
                sum += nums[i];
            }
        }
        return sum;
    }
}

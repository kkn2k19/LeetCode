// 16.10.2025
// https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/?envType=daily-question&envId=2025-10-16
// 3423. Maximum Difference Between Adjacent Elements in a Circular Array

import java.util.*;

public class E_3423_MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = Math.abs(nums[nums.length - 1] - nums[0]); // // let it as max now
        for (int i = 1; i < nums.length; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i - 1]));
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4 };
        System.out.println(maxAdjacentDistance(nums1));

        int[] nums2 = { -5, -10, -5 };
        System.out.println(maxAdjacentDistance(nums2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3423_MaximumDifferenceBetweenAdjacentElementsInACircularArray.java && java
// E_3423_MaximumDifferenceBetweenAdjacentElementsInACircularArray && del
// E_3423_MaximumDifferenceBetweenAdjacentElementsInACircularArray.class
// 3
// 5

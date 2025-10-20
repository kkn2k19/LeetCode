// 20.10.2025
// https://leetcode.com/contest/weekly-contest-472/problems/smallest-missing-multiple-of-k/description/
// Q1. Smallest Missing Multiple of K

import java.util.*;

public class E_WC472Q1_SmallestMissingMultipleOfK {
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int val = k;
        while (true) {
            if (!set.contains(val))
                return val;
            val += k;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 8, 2, 3, 4, 6 };
        int k1 = 2;
        System.out.println(missingMultiple(nums1, k1));

        int[] nums2 = { 1, 4, 7, 10, 15 };
        int k2 = 5;
        System.out.println(missingMultiple(nums2, k2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_WC472Q1_SmallestMissingMultipleOfK.java && java
// E_WC472Q1_SmallestMissingMultipleOfK && del
// E_WC472Q1_SmallestMissingMultipleOfK.class
// 10
// 5
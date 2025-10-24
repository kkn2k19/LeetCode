// 24.10.2025
// https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/?envType=daily-question&envId=2025-10-24
// 2210. Count Hills and Valleys in an Array

import java.util.*;

public class E_2210_CountHillsAndValleysInAnArray {
    public static int countHillValley(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                list.add(nums[i]);
            }
        }

        int count = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            int left = list.get(i - 1);
            int right = list.get(i + 1);
            if (list.get(i) > left && list.get(i) > right) {
                count += 1;
            }
            if (list.get(i) < left && list.get(i) < right) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 4, 1, 1, 6, 5 };
        System.out.println(countHillValley(nums1));

        int[] nums2 = { 6, 6, 5, 5, 4, 1 };
        System.out.println(countHillValley(nums2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2210_CountHillsAndValleysInAnArray.java && java
// E_2210_CountHillsAndValleysInAnArray && del
// E_2210_CountHillsAndValleysInAnArray.class
// 3
// 0
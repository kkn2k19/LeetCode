// 26.10.2025
// https://leetcode.com/problems/third-maximum-number/description/?envType=problem-list-v2&envId=array
// 183. Third Maximum Number

import java.util.*;

public class E_183_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1];
        int count = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (max != nums[i]) {
                count += 1;
                max = nums[i];
            }
            if (count == 3) {
                return max;
            }
        }
        return nums[n - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 1 };
        System.out.println(thirdMax(nums1));

        int[] nums2 = { 1, 2 };
        System.out.println(thirdMax(nums2));

        int[] nums3 = { 2, 2, 3, 1 };
        System.out.println(thirdMax(nums3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_183_ThirdMaximumNumber.java && java E_183_ThirdMaximumNumber && del
// E_183_ThirdMaximumNumber.class
// 1
// 2
// 1
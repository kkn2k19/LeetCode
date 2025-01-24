// 24.01.2025
// https://leetcode.com/problems/median-of-two-sorted-arrays/
// 4. Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

import java.util.Scanner;
import java.util.Arrays;

public class H_4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array 1 : ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.print("Enter elements of Array 1 : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter length of Array 2 : ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.print("Enter elements of Array 2 : ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("Array Provided : " + Arrays.toString(nums1) + " " + Arrays.toString(nums2));
        System.out.println("Median of Both Sorted Arrays : " + findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            num[i] = nums1[i];
        }
        for (int i = 0 + nums1.length; i < nums1.length + nums2.length; i++) {
            num[i] = nums2[i - nums1.length];
        }

        Arrays.sort(num);

        if ((nums1.length + nums2.length) % 2 == 0) {
            return (num[num.length / 2] + num[num.length / 2 - 1]) / 2.0;
        } else {
            return num[num.length / 2];
        }
    }
}

// OUTPUT -----
// Enter length of Array 1 : 2
// Enter elements of Array 1 : 1 2
// Enter length of Array 2 : 2
// Enter elements of Array 2 : 3 4
// Array Provided : [1, 2] [3, 4]
// Median of Both Sorted Arrays : 2.5
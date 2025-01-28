// 28.01.2025
// https://leetcode.com/problems/two-sum/description/
// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.Scanner;
import java.util.Arrays;

public class E_1_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n1 = sc.nextInt();
        int[] nums = new int[n1];
        System.out.print("Enter elements of Array : ");
        for (int i = 0; i < n1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.println("Result : " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    arr[0] = j;
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}

// // OUTPUT -----

// Enter length of Array : 4
// Enter elements of Array : 2 7 11 15
// Enter target : 9
// Result : [0, 1]

// Enter length of Array : 3
// Enter elements of Array : 3 2 4
// Enter target : 6
// Result : [1, 2]

// Enter length of Array : 2
// Enter elements of Array : 3 3
// Enter target : 6
// Result : [0, 1]
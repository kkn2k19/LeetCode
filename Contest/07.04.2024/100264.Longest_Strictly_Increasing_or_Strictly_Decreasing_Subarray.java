// 07.04.2024
// https://leetcode.com/contest/weekly-contest-392/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
// 100264. Longest Strictly Increasing or Strictly Decreasing Subarray

import java.util.Scanner;

public class 100264.Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
  public static void main(String[] args) {
    #rest code
  }
  static int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }
        int maxLength = 1;
        int increasingLength = 1;
        int decreasingLength = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                increasingLength++;
                decreasingLength = 1;
            } else if (nums[i] < nums[i - 1]) {
                decreasingLength++;
                increasingLength = 1;
            } else {
                increasingLength = 1;
                decreasingLength = 1;
            }
            maxLength = Math.max(maxLength, Math.max(increasingLength, decreasingLength));
        }
        return maxLength;
    }
}

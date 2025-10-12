// 12.10.2025
// https://leetcode.com/contest/weekly-contest-471/problems/sum-of-elements-with-frequency-divisible-by-k/description/
// Q1. Sum of Elements With Frequency Divisible by K

import java.util.HashMap;

public class E_WC471Q1_SumOfElementsWithFrequencyDivisibleByK {
    public static int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) % k == 0) {
                sum += (key * map.get(key));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 3, 3, 3, 4 };
        int k1 = 2;
        System.out.println(sumDivisibleByK(nums1, k1));

        int[] nums2 = { 1, 2, 3, 4, 5 };
        int k2 = 2;
        System.out.println(sumDivisibleByK(nums2, k2));

        int[] nums3 = { 4, 4, 4, 1, 2, 3 };
        int k3 = 3;
        System.out.println(sumDivisibleByK(nums3, k3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_WC471Q1_SumOfElementsWithFrequencyDivisibleByK.java && java
// E_WC471Q1_SumOfElementsWithFrequencyDivisibleByK && del
// E_WC471Q1_SumOfElementsWithFrequencyDivisibleByK.class
// 16
// 0
// 12
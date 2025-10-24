// 25.10.2025
// https://leetcode.com/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-10-24
// 594. Longest Harmonious Subsequence

import java.util.*;

public class E_594_LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxLen = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, map.get(key) + map.get(key + 1));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS(nums1));

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(findLHS(nums2));

        int[] nums3 = { 1, 1, 1, 1 };
        System.out.println(findLHS(nums3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_594_LongestHarmoniousSubsequence.java && java
// E_594_LongestHarmoniousSubsequence && del
// E_594_LongestHarmoniousSubsequence.class
// 5
// 2
// 0
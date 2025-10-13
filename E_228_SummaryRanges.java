// 13.10.2025
// https://leetcode.com/problems/summary-ranges/
// 228. Summary Ranges

import java.util.*;

public class E_228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i += 1;
            }
            int end = nums[i];

            StringBuilder sb = new StringBuilder();
            sb.append(start);
            if (start != end) {
                // sb.append("->" + end);
                sb.append("->");
                sb.append(end);
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 2, 4, 5, 7 };
        System.out.println(summaryRanges(nums1));

        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        System.out.println(summaryRanges(nums2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_228_SummaryRanges.java && java E_228_SummaryRanges && del
// E_228_SummaryRanges.class
// [0->2, 4->5, 7]
// [0, 2->4, 6, 8->9]
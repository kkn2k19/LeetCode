// 17.10.2025
// https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-10-17
// 2016. Maximum Difference Between Increasing Elements

public class E_2016_MaximumDifferenceBetweenIncreasingElements {
    public static int maximumDifference(int[] nums) {
        int max = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    int diff = nums[j] - nums[i];
                    max = Math.max(max, diff);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = { 7, 1, 5, 4 };
        System.out.println(maximumDifference(nums1));

        int[] nums2 = { 9, 4, 3, 2 };
        System.out.println(maximumDifference(nums2));

        int[] nums3 = { 1, 5, 2, 10 };
        System.out.println(maximumDifference(nums3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2016_MaximumDifferenceBetweenIncreasingElements.java && java
// E_2016_MaximumDifferenceBetweenIncreasingElements && del
// E_2016_MaximumDifferenceBetweenIncreasingElements.class
// 4
// -1
// 9

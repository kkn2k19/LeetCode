// 11.10.2025
// https://leetcode.com/problems/count-special-quadruplets/description/
// 1995. Count Special Quadruplets

public class E_1995_CountSpecialQuadruplets {
    public static int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if ((nums[i] + nums[j] + nums[k]) == nums[l])
                            count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 6 };
        System.out.println(countQuadruplets(nums1));

        int[] nums2 = { 3, 3, 6, 4, 5 };
        System.out.println(countQuadruplets(nums2));

        int[] nums3 = { 1, 1, 1, 3, 5 };
        System.out.println(countQuadruplets(nums3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_1995_CountSpecialQuadruplets.java && java E_1995_CountSpecialQuadruplets &&
// del E_1995_CountSpecialQuadruplets.class
// 1
// 0
// 4
// 01.05.2024
// 268. Missing Number 
// https://leetcode.com/problems/missing-number/

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctPos]) {
                swap(nums, i, correctPos);
            } else {
                i++;
            }
        }
        return searchMissing(nums);
    }

    static int searchMissing(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
 * Output --
 * 8
 */

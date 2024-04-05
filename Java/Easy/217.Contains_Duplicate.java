// 05.04.2024
// https://leetcode.com/problems/contains-duplicate/description/
// 217. Contains Duplicate

import java.util.Scanner;
import java.util.Arrays;

public class 217.Contains_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // true for duplicate found and false for all unique.
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Output --
 * 
 * Enter size of Array : 5
 * Enter Elements of Array : 1 2 3 4 5
 * false
 * 
 * Enter size of Array : 5
 * Enter Elements of Array : 1 2 3 4 5
 * true
 */

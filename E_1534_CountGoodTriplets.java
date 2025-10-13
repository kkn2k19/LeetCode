// 13.10.2025
// https://leetcode.com/problems/count-good-triplets/
// 1534. Count Good Triplets

import java.lang.Math;

public class E_1534_CountGoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) > a)
                    continue; // if first case fails then no need check other conditions
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                        count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 0, 1, 1, 9, 7 };
        int a1 = 7;
        int b1 = 2;
        int c1 = 3;
        System.out.println(countGoodTriplets(arr1, a1, b1, c1));

        int[] arr2 = { 1, 1, 2, 2, 3 };
        int a2 = 0;
        int b2 = 0;
        int c2 = 1;
        System.out.println(countGoodTriplets(arr2, a2, b2, c2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_1534_CountGoodTriplets.java && java E_1534_CountGoodTriplets && del
// E_1534_CountGoodTriplets.class
// 4
// 0
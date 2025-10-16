// 16.10.2025
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/?envType=daily-question&envId=2025-10-16
// 2894. Divisible and Non-divisible Sums Difference

import java.util.*;

public class E_2894_DivisibleAndNonDivisibleSumsDifference {
    public static int differenceOfSums(int n, int m) {
        int nums1 = 0;
        int nums2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                nums1 += i;
            } else {
                nums2 += i;
            }
        }
        return nums1 - nums2;
    }

    public static void main(String[] args) {
        int n1 = 10, m1 = 3;
        System.out.println(differenceOfSums(n1, m1));

        int n2 = 5, m2 = 6;
        System.out.println(differenceOfSums(n2, m2));

        int n3 = 5, m3 = 1;
        System.out.println(differenceOfSums(n3, m3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2894_DivisibleAndNonDivisibleSumsDifference.java && java
// E_2894_DivisibleAndNonDivisibleSumsDifference && del
// E_2894_DivisibleAndNonDivisibleSumsDifference.class
// 19
// 15
// -15
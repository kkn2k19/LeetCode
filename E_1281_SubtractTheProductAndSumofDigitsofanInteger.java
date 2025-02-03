// 03.02.2025
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
// 1281. Subtract the Product and Sum of Digits of an Integer

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

// Example 1:
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

// Example 2:
// Input: n = 4421
// Output: 21
// Explanation: 
// Product of digits = 4 * 4 * 2 * 1 = 32 
// Sum of digits = 4 + 4 + 2 + 1 = 11 
// Result = 32 - 11 = 21

import java.util.Scanner;

public class E_1281_SubtractTheProductAndSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Difference between Product and Sum of Digit : " + subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return product - sum;
    }
}

// OUTPUT ---

// Enter a number : 234
// Difference between Product and Sum of Digit : 15

// Enter a number : 4421
// Difference between Product and Sum of Digit : 21
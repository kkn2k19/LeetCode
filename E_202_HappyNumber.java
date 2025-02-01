// 01.02.2025
// https://leetcode.com/problems/happy-number/description/
// 202. Happy Number

// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

// Example 1:
// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

// Example 2:
// Input: n = 2
// Output: false

import java.util.Scanner;
import java.util.HashSet;

public class E_202_HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n + (isHappy(n) ? " is a Happy Number." : " is not a Happy Number."));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<Integer>();

        while (n != 1 && !map.contains(n)) {
            map.add(n); // store the sum if it doesnot repeated
            n = sumOfSquares(n); // now store sum in n and again run the loop until n==1
        }
        return (n == 1);
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}

// OUTPUT ---

// Enter a number : 19
// 19 is a Happy Number.

// Enter a number : 2
// 2 is not a Happy Number.
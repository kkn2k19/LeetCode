// 28.03.2024
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
// 1281. Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int n = sc.nextInt();
        System.out.println("Difference b/w Product and Sum of Digits : " + subtractProductAndSum(n));
    }

    static int subtractProductAndSum(int n) {
        int i = n;
        int d;
        int sum = 0;
        int product = 1;
        while (i > 0) {
            d = i % 10;
            sum += d;
            product *= d;
            i /= 10;
        }
        System.out.println("Sum of Digits : " + sum + "\nProduct of Digits : " + product);
        return (product - sum);
    }
}

/*
 * 
 * Outputs --
 * 
 * Provide a Number : 1234
 * Sum of Digits : 10
 * Product of Digits : 24
 * Difference b/w Product and Sum of Digits : 14
 */

// 25.10.2025
// https://leetcode.com/problems/ugly-number/description/
// 263. Ugly Number

public class E_263_UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;
        int[] primes = { 2, 3, 5 };
        for (int p : primes) {
            while (n % p == 0) {
                n /= p;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 6;
        System.out.println(isUgly(n1));

        int n2 = 1;
        System.out.println(isUgly(n2));

        int n3 = 14;
        System.out.println(isUgly(n3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_263_UglyNumber.java && java E_263_UglyNumber && del E_263_UglyNumber.class
// true
// true
// false
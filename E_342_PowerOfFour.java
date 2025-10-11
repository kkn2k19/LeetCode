// 11.10.2025
// https://leetcode.com/problems/power-of-four/description/
// 342. Power of Four

public class E_342_PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 16;
        System.out.println(isPowerOfFour(n1));

        int n2 = 5;
        System.out.println(isPowerOfFour(n2));

        int n3 = 1;
        System.out.println(isPowerOfFour(n3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_342_PowerOfFour.java && java E_342_PowerOfFour && del
// E_342_PowerOfFour.class
// true
// false
// true
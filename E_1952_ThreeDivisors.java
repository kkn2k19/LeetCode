// 11.10.2025
// https://leetcode.com/problems/three-divisors/
// 1952. Three Divisors

public class E_1952_ThreeDivisors {
    // public static boolean isThree(int n) {
    // int count = 0;
    // int i = 1;
    // while (i * i <= n) {
    // if (n % i == 0) {
    // count += 1;
    // if (i != n / i)
    // count += 1;
    // }
    // i += 1;
    // }
    // // System.out.print(count);
    // if (count == 3)
    // return true;
    // return false;
    // }

    // if it has 3 factors it means - 1, n, and Math.sqrt(n) -- which means n must
    // be a perfect square
    public static boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        if (root * root != n)
            return false; // not a perfect square
        return isPrime(root);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(isThree(n1));

        int n2 = 4;
        System.out.println(isThree(n2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_1952_ThreeDivisors.java && java E_1952_ThreeDivisors && del
// E_1952_ThreeDivisors.class
// false
// true
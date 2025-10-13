// 13.10.2025
// https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/
// 2749. Minimum Operations to Make the Integer Zero

public class M_2749_MinimumOperationsToMakeTheIntegerZero {
    public static int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i <= 60; i++) {
            long diff = (long) num1 - (long) i * num2;
            if (diff < 0)
                continue;

            int onebits = count1Bits(diff);
            if (onebits <= i && i <= diff)
                return i;
        }
        return -1;
    }

    public static int count1Bits(long n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count += 1;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a1 = 3;
        int b1 = -2;
        System.out.println(makeTheIntegerZero(a1, b1));

        int a2 = 5;
        int b2 = 7;
        System.out.println(makeTheIntegerZero(a2, b2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2749_MinimumOperationsToMakeTheIntegerZero.java && java
// M_2749_MinimumOperationsToMakeTheIntegerZero && del
// M_2749_MinimumOperationsToMakeTheIntegerZero.class
// 3
// -1
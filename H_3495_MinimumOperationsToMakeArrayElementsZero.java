// 13.10.2025
// https://leetcode.com/problems/minimum-operations-to-make-array-elements-zero/
// 3495. Minimum Operations to Make Array Elements Zero

public class H_3495_MinimumOperationsToMakeArrayElementsZero {
    public static long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] q : queries) {
            long totalSteps = stepsUpTo(q[1]) - stepsUpTo(q[0] - 1);
            ans += (totalSteps + 1) / 2; // ceil divide by 2
        }
        return ans;
    }

    public static long stepsUpTo(long n) {
        long sum = 0, step = 1, size = 1;
        while (n > 0) {
            long take = Math.min(size * 3, n);
            sum += take * step;
            n -= take;
            size *= 4;
            step++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] queries1 = {
                { 1, 2 },
                { 2, 4 }
        };
        System.out.println(minOperations(queries1));

        int[][] queries2 = {
                { 2, 6 }
        };
        System.out.println(minOperations(queries2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// H_3495_MinimumOperationsToMakeArrayElementsZero.java && java
// H_3495_MinimumOperationsToMakeArrayElementsZero && del
// H_3495_MinimumOperationsToMakeArrayElementsZero.class
// 3
// 4

/*
 * stepsUpto --
 * 1,2,3 -- steps = 1 -- bucket size = 1*3
 * 4 to 15 -- steps = 2 -- size = 12 = 3*4
 * 16 to 63 -- steps = 3 -- size = 48 = 12*4
 * here conlcude that
 * size initially = 1
 * but we need to look at intake or required so take = min (size * 3,n)
 * tehn n-= take;
 * then after ech itr size*=4 with prevSize
 * steps ++ after each itr
 */

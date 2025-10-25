// 25.10.2025
// https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
// 1716. Calculate Money in Leetcode Bank

public class E_1716_CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int sum = 0;
        int week = 1;
        int totalWeeks = n / 7;
        int extraDays = n % 7;
        while (week <= totalWeeks) {
            int val = week;
            for (int i = 1; i <= 7; i++) {
                sum += val;
                val += 1;
            }
            week += 1;
        }

        int val = week;
        for (int i = 1; i <= extraDays; i++) {
            sum += val;
            val += 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 4;
        System.out.println(totalMoney(n1));

        int n2 = 10;
        System.out.println(totalMoney(n2));

        int n3 = 20;
        System.out.println(totalMoney(n3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_1716_CalculateMoneyInLeetcodeBank.java && java
// E_1716_CalculateMoneyInLeetcodeBank && del
// E_1716_CalculateMoneyInLeetcodeBank.class
// 10
// 37
// 96
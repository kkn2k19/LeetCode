// 13.10.2025
// https://leetcode.com/problems/robot-return-to-origin/
// 657. Robot Return to Origin

public class E_657_RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        // 2D-plane -> U - y++ || D - y-- || L - x-- || R - x++
        int x = 0; // x axis
        int y = 0; // y axis

        for (char ch : moves.toCharArray()) {
            if (ch == 'U')
                y += 1;
            else if (ch == 'D')
                y -= 1;
            else if (ch == 'L')
                x -= 1;
            else if (ch == 'R')
                x += 1;
        }

        if (x == 0 && y == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        System.out.println(judgeCircle(moves1));

        String moves2 = "LL";
        System.out.println(judgeCircle(moves2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_657_RobotReturnToOrigin.java && java E_657_RobotReturnToOrigin && del
// E_657_RobotReturnToOrigin.class
// true
// false
// 25.10.2025
// https://leetcode.com/problems/rectangle-area/description/
// 223. Rectangle Area

public class M_223_RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

        int commonArea = 0;
        int commonLength = Math.min(ay2, by2) - Math.max(ay1, by1);
        int commonBreadth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        if (commonLength > 0 && commonBreadth > 0) {
            commonArea = commonLength * commonBreadth;
        }
        return areaA + areaB - commonArea;
    }

    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));

        System.out.println(computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_223_RectangleArea.java && java M_223_RectangleArea && del
// M_223_RectangleArea.class
// 45
// 16
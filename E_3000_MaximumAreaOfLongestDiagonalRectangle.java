// 23.10.2025
// https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-10-22
// 3000. Maximum Area of Longest Diagonal Rectangle

public class E_3000_MaximumAreaOfLongestDiagonalRectangle {
    public static double diagonal(int l, int b) {
        return Math.sqrt(l * l + b * b);
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0.0;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int breadth = dimensions[i][1];
            int area = length * breadth;
            if (diagonal(length, breadth) > maxDiagonal) {
                maxDiagonal = diagonal(length, breadth);
                maxArea = area;
            }
            if (diagonal(length, breadth) == maxDiagonal) {
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] dimensions1 = { { 9, 3 }, { 8, 6 } };
        System.out.println(areaOfMaxDiagonal(dimensions1));

        int[][] dimensions2 = { { 3, 4 }, { 4, 3 } };
        System.out.println(areaOfMaxDiagonal(dimensions2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3000_MaximumAreaOfLongestDiagonalRectangle.java && java
// E_3000_MaximumAreaOfLongestDiagonalRectangle && del
// E_3000_MaximumAreaOfLongestDiagonalRectangle.class
// 48
// 12
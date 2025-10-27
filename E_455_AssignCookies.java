// 28.10.2025
// https://leetcode.com/problems/assign-cookies/description/
// 455. Assign Cookies

import java.util.*;

public class E_455_AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count += 1;
                i += 1;
            }
            j += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g1 = { 1, 2, 3 };
        int[] s1 = { 1, 1 };
        System.out.println(findContentChildren(g1, s1));

        int[] g2 = { 1, 2 };
        int[] s2 = { 1, 2, 3 };
        System.out.println(findContentChildren(g2, s2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_455_AssignCookies.java && java E_455_AssignCookies && del
// E_455_AssignCookies.class
// 1
// 2
// 18.10.2025
// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-10-18
// 2138. Divide a String Into Groups of Size k

import java.util.*;

public class E_2138_DivideAStringIntoGroupsOfSizeK {
    public static String[] divideString(String s, int k, char fill) {
        int n = s.length();
        if (n % k != 0) {
            int extra = k - (n % k);
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < extra; i++) {
                sb.append(fill);
            }
            s = sb.toString();
        }
        int size = s.length() / k;
        String[] res = new String[size];
        int start = 0;
        for (int i = 0; i < size; i++) {
            res[i] = s.substring(start, start + k);
            start += k;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "abcdefghi";
        int k1 = 3;
        char fill1 = 'x';
        System.out.println(Arrays.toString(divideString(s1, k1, fill1)));

        String s2 = "abcdefghij";
        int k2 = 3;
        char fill2 = 'x';
        System.out.println(Arrays.toString(divideString(s2, k2, fill2)));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2138_DivideAStringIntoGroupsOfSizeK.java && java
// E_2138_DivideAStringIntoGroupsOfSizeK && del
// E_2138_DivideAStringIntoGroupsOfSizeK.class
// [abc, def, ghi]
// [abc, def, ghi, jxx]
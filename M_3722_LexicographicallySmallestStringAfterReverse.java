// 31.10.2025
// https://leetcode.com/problems/lexicographically-smallest-string-after-reverse/description/
// 3722. Lexicographically Smallest String After Reverse

public class M_3722_LexicographicallySmallestStringAfterReverse {
    public static String rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // public static String rev(String s) {
    //     char[] arr = s.toCharArray();
    //     int start = 0;
    //     int end = s.length() - 1;
    //     while (start < end) {
    //         char temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start += 1;
    //         end -= 1;
    //     }
    //     return new String(arr);
    // }

    public static String lexSmallest(String s) {
        int n = s.length();
        String res = s;
        for (int k = 1; k <= n; k++) {
            String part1 = rev(s.substring(0, k));
            String temp1 = part1 + s.substring(k);
            if (temp1.compareTo(res) < 0) {
                res = temp1;
            }

            String part2 = rev(s.substring(n - k));
            String temp2 = s.substring(0, n - k) + part2;
            if (temp2.compareTo(res) < 0) {
                res = temp2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "dcab";
        System.out.println(lexSmallest(s1));

        String s2 = "abba";
        System.out.println(lexSmallest(s2));

        String s3 = "zxy";
        System.out.println(lexSmallest(s3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3722_LexicographicallySmallestStringAfterReverse.java && java
// M_3722_LexicographicallySmallestStringAfterReverse && del
// M_3722_LexicographicallySmallestStringAfterReverse.class
// acdb
// aabb
// xzy
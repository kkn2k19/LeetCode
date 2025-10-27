// 28.10.2025
// https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-10-17
// 3330. Find the Original Typed String I

public class E_3330_FindTheOriginalTypedStringI {
    // public static int possibleStringCount(String word) {
    //     int n = word.length();
    //     int total = 1;
    //     int start = 0;
    //     while (start < n) {
    //         int end = start + 1;
    //         while (end < n && word.charAt(start) == word.charAt(end)) {
    //             end += 1;
    //         }
    //         int repeats = end - start - 1;
    //         total += repeats;
    //         start = end;
    //     }
    //     return total;
    // }

    public static int possibleStringCount(String word){
        int res = 1;
        int n = word.length();
        for (int  i =1; i < n; i++){
            if (word.charAt(i- 1) == word.charAt(i)) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String word1 = "abbcccc";
        System.out.println(possibleStringCount(word1));

        String word2 = "abcd";
        System.out.println(possibleStringCount(word2));

        String word3 = "aaaa";
        System.out.println(possibleStringCount(word3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3330_FindTheOriginalTypedStringI.java && java
// E_3330_FindTheOriginalTypedStringI && del
// E_3330_FindTheOriginalTypedStringI.class
// 5
// 1
// 4
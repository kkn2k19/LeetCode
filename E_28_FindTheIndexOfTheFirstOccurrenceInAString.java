// 31.01.2025
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// 28. Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

import java.util.Scanner;

public class E_28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Main String : ");
        String mStr = sc.nextLine();
        System.out.print("Provide Sub String : ");
        String nStr = sc.nextLine();
        System.out.println("Index of the first occurrence of " + nStr + " in " + mStr + " : " + strStr(mStr, nStr));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {   // length will be 0 when both n and m is same so make it <= n-m
            if (haystack.substring(i, i + m).equals(needle)) { // it will check for substring from i = 0 to 0+m(excluded) which means upto i = 0 to 0+m-1 then i++
                return i;
            }
        }
        return -1;
    }
}

// OUTPUT ---
// Provide Main String : sadbutsad
// Provide Sub String : sad
// Index of the first occurrence of sad in sadbutsad : 0

// Provide Main String : leetcode
// Provide Sub String : leeto
// Index of the first occurrence of leeto in leetcode : -1
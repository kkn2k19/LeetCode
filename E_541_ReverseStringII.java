// 23.01.2025
// https://leetcode.com/problems/reverse-string-ii/description/
// 541. Reverse String II

// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"

// Example 2:
// Input: s = "abcd", k = 2
// Output: "bacd"

import java.util.Scanner;

public class E_541_ReverseStringII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        System.out.println("Reversed String : " + reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        // we need to convert String to Array to make changes since Strings are
        // immutable.
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i = i + 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            rev(arr, start, end);
        }
        return new String(arr);
    }

    public static void rev(char[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        swap(arr, i, j);
        rev(arr, i + 1, j - 1);
    }

    public static void swap(char[] arr, int i, int j) {
        char a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
}

// OUTPUT -----

// Enter String : abcdefg
// Enter k : 2
// Reversed String : bacdfeg

// Enter String : abcd
// Enter k : 2
// Reversed String : bacd
// 30.01.2025
// https://leetcode.com/problems/length-of-last-word/description/
// 58. Length of Last Word

// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Example 2:
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

// Example 3:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

import java.util.Scanner;

public class E_58_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide String : ");
        String str = sc.nextLine();
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        String[] words = s.trim().split(" "); // first trim the starting and ending spaces of the string and then split
                                              // them using " " separator.
        length = words[words.length - 1].length();
        return length;
    }
}

// OUTPUT ---
// Provide String : Hello World
// 5

// Provide String :    fly me   to   the moon  
// 4

// Provide String : luffy is still joyboy
// 6
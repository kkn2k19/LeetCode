// 02.02.2025
// https://leetcode.com/problems/first-bad-version/description/
// 278. First Bad Version

// You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

// Example 1:
// Input: n = 5, bad = 4
// Output: 4
// Explanation:
// call isBadVersion(3) -> false
// call isBadVersion(5) -> true
// call isBadVersion(4) -> true
// Then 4 is the first bad version.

// Example 2:
// Input: n = 1, bad = 1
// Output: 1

import java.util.Scanner;

public class E_278_FirstBadVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for n and bad version
        System.out.print("Enter the number of versions (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the first bad version: ");
        badVersion = sc.nextInt(); // Store the first bad version

        // Calling the function and displaying output
        int result = firstBadVersion(n);
        System.out.println("First bad version: " + result);
    }

    // Simulated API method (this will be given in LeetCode)
    public static int badVersion; // This represents the first bad version

    public static boolean isBadVersion(int version) {
        return version >= badVersion; // Returns true if the version is bad
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (isBadVersion(mid)){
                end = mid - 1;   // if bad found then look for first bad in its left 
            } else {
                start = mid + 1;   // if good found then bad must be in its right side
            }
        }
        return start;// when both start end points to same value then it must be the first bad just return its index
    }
}

// OUTPUT ---

// Enter the number of versions (n): 5
// Enter the first bad version: 4
// First bad version: 4

// Enter the number of versions (n): 1
// Enter the first bad version: 1
// First bad version: 1
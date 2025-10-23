// 24.10.2025
// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/description/?envType=daily-question&envId=2025-10-23
// 2200. Find All K-Distant Indices in an Array

import java.util.*;

public class E_2200_FindAllKDistantIndicesInAnArray {
    // O(n^2) - 110ms
    // public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    //     int n = nums.length;
    //     List<Integer> list = new LinkedList<>();
    //     Set<Integer> set = new HashSet<>();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if ((Math.abs(i - j) <= k) && (nums[j] == key)) {
    //                 set.add(i);
    //             }
    //         }
    //     }
    //     for (int val : set) {
    //         list.add(val);
    //     }
    //     Collections.sort(list);
    //     return list;
    // }

    // O(n^2) - 440ms
    // public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    //     int n = nums.length;
    //     Set<Integer> set = new TreeSet<>();
    //     for (int i = 0; i < n; i++){
    //         for (int j = 0; j < n; j++){
    //             if ((Math.abs(i-j) <= k) && (key == nums[j])) {
    //                 set.add(i);
    //             }
    //         }
    //     }
    //     return new ArrayList<>(set);
    // }

    // o(n^2) - 15ms
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((Math.abs(i - j) <= k) && (nums[j] == key)) {
                    set.add(i);
                    break; // for current i it is added so more this i needed pass to next one
                }
            }
        }
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 9, 1, 3, 9, 5 };
        int key1 = 9;
        int k1 = 1;
        System.out.println(findKDistantIndices(nums1, key1, k1));

        int[] nums2 = { 2, 2, 2, 2, 2 };
        int key2 = 2;
        int k2 = 2;
        System.out.println(findKDistantIndices(nums2, key2, k2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_2200_FindAllKDistantIndicesInAnArray.java && java
// E_2200_FindAllKDistantIndicesInAnArray && del
// E_2200_FindAllKDistantIndicesInAnArray.class
// [1, 2, 3, 4, 5, 6]
// [0, 1, 2, 3, 4]
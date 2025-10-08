// 09.10.2025
// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=daily-question&envId=2025-10-08
// 2300. Successful Pairs of Spells and Potions

import java.util.*;

public class M_2300_SuccessfulPairsOfSpellsAndPotions {
    // Brute Force -- TLE on LC -- O(n*m)
    // public static int[] successfulPairs(int[] spells, int[] potions, long success) {
    //     int[] pairs = new int[spells.length];
    //     int i = 0;
    //     for (int s : spells) {
    //         int count = 0;
    //         for (int p : potions) {
    //             if ((long) p * s >= success)
    //                 count += 1;
    //         }
    //         pairs[i] = count;
    //         i += 1;
    //     }
    //     return pairs;
    // }

    // Binary Search + sorting logic -- sorting->O(mlogm) , each spell -> O(logm)  -- O((n+m)logm)
    public static int[] successfulPairs(int[] spells, int[] potions, long success){
        Arrays.sort(potions);
        int m = potions.length;
        int[] pairs = new int[spells.length];

        for (int i = 0; i < spells.length; i++){
            int spell = spells[i];

            // now for every spell - find min potion to make it successful (since potion*spell >= success so potion >= sucess/spell)
            // use this formula for getting one value larger than P = su/sp
            long minPotion = (success + spell - 1)/spell;

            int index = binarySearch(potions, minPotion);  // find first index where potion >= minPotion

            pairs[i] = m - index; // since potions is sorted so from i=index to m all potions will satisfy for this spell
        }
        return pairs;
    }

    public static int binarySearch(int[] potions, long target){
        int start = 0;
        int end = potions.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (potions[mid] < target) start = mid + 1;
            else end= mid - 1;
        }
        return start; // first index with potion >= target
    }

    public static void main(String[] args) {
        int[] spells1 = { 5, 1, 3 };
        int[] potions1 = { 1, 2, 3, 4, 5 };
        long success1 = 7;

        System.out.println(Arrays.toString(successfulPairs(spells1, potions1, success1)));

        int[] spells2 = { 3, 1, 2 };
        int[] potions2 = { 8, 5, 8 };
        long success2 = 16;

        System.out.println(Arrays.toString(successfulPairs(spells2, potions2, success2)));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2300_SuccessfulPairsOfSpellsAndPotions.java && java
// M_2300_SuccessfulPairsOfSpellsAndPotions && del
// M_2300_SuccessfulPairsOfSpellsAndPotions.class
// [4, 0, 3]
// [2, 0, 2]

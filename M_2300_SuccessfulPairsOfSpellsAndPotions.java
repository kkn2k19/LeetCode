// 09.10.2025
// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=daily-question&envId=2025-10-08
// 2300. Successful Pairs of Spells and Potions

import java.util.Arrays;

public class M_2300_SuccessfulPairsOfSpellsAndPotions {
    // Brute Force
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        int i = 0;
        for (int s : spells) {
            int count = 0;
            for (int p : potions) {
                if ((long) p * s >= success)
                    count += 1;
            }
            pairs[i] = count;
            i += 1;
        }
        return pairs;
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

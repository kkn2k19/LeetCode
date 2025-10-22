// 23.10.2025
// https://leetcode.com/problems/fruits-into-baskets-ii/?envType=daily-question&envId=2025-10-22
// 3477. Fruits Into Baskets II

import java.util.*;

public class E_3477_FruitsIntoBasketII {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        int count = 0;
        boolean[] usedBasket = new boolean[n];
        Arrays.fill(usedBasket, false);
        for (int f = 0; f < n; f++) {
            boolean placed = false;
            for (int b = 0; b < n; b++) {
                if (!usedBasket[b] && fruits[f] <= baskets[b]) {
                    placed = true;
                    usedBasket[b] = true;
                    break;
                }
            }
            if (!placed)
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] fruits1 = { 4, 2, 5 };
        int[] baskets1 = { 3, 5, 4 };
        System.out.println(numOfUnplacedFruits(fruits1, baskets1));

        int[] fruits2 = { 3, 6, 1 };
        int[] baskets2 = { 6, 4, 7 };
        System.out.println(numOfUnplacedFruits(fruits2, baskets2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3477_FruitsIntoBasketII.java && java E_3477_FruitsIntoBasketII && del
// E_3477_FruitsIntoBasketII.class

// 1
// 0
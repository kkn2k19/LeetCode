// 11.10.2025
// https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/description/
// 2260. Minimum Consecutive Cards to Pick Up

import java.util.HashMap;

public class M_2260_MinimumConsecutiveCardsToPickUp {
    public static int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                int index = map.get(cards[i]);
                min = Math.min(min, i - index + 1);
            }
            map.put(cards[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[] cards1 = { 3, 4, 2, 3, 4, 7 };
        System.out.println(minimumCardPickup(cards1));

        int[] cards2 = { 1, 0, 5, 3 };
        System.out.println(minimumCardPickup(cards2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2260_MinimumConsecutiveCardsToPickUp.java && java
// M_2260_MinimumConsecutiveCardsToPickUp && del
// M_2260_MinimumConsecutiveCardsToPickUp.class
// 4
// -1
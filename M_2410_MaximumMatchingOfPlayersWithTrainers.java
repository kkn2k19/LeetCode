// 28.10.2025
// https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/?envType=daily-question&envId=2025-10-27
// 2410. Maximum Matching of Players With Trainers

import java.util.*;

public class M_2410_MaximumMatchingOfPlayersWithTrainers {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        int i = 0, j = 0;
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                count += 1;
                i += 1;
            }
            j += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] players1 = { 4, 7, 9 };
        int[] trainers1 = { 8, 2, 5, 8 };
        System.out.println(matchPlayersAndTrainers(players1, trainers1));

        int[] players2 = { 1, 1, 1 };
        int[] trainers2 = { 10 };
        System.out.println(matchPlayersAndTrainers(players2, trainers2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2410_MaximumMatchingOfPlayersWithTrainers.java && java
// M_2410_MaximumMatchingOfPlayersWithTrainers && del
// M_2410_MaximumMatchingOfPlayersWithTrainers.class
// 2
// 1

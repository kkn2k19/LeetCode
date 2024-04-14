// 14.04.2024
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
// 1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        list = kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}

/*
 * Output --
 * 
 * [true, true, true, false, true]
 */

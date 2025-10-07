// 08.10.2025
// https://leetcode.com/problems/avoid-flood-in-the-city/description/?envType=daily-question&envId=2025-10-07
// 1488. Avoid Flood in The City

import java.util.*;

public class M_1488_AvoidFloodInTheCity {
    public static int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];

        HashSet<Integer> fullLakes = new HashSet<>(); // lakes full currently
        HashMap<Integer, Integer> lastRainDay = new HashMap<>(); // last filled day for each lake
        ArrayList<Integer> dryDays = new ArrayList<>(); // available dry days for emptying a lake

        for (int day = 0; day < n; day++) {
            int lake = rains[day];

            if (lake == 0) {
                dryDays.add(day);
                ans[day] = 1; // let's take we emptied lake 1 for example as Default will be updated later
                continue;
            }

            ans[day] = -1; // rainy day

            // If lake already full → find a dry day after last rain
            if (fullLakes.contains(lake)) {
                int lastDay = lastRainDay.get(lake);

                // binary search for finding first dry day after this lake's lastRainDay
                int dryIndex = findDryDay(dryDays, lastDay);

                if (dryIndex == -1)
                    return new int[] {}; // no dry day available -> flood

                int dryDay = dryDays.get(dryIndex);
                ans[dryDay] = lake; // updated that default value of 1
                dryDays.remove(dryIndex); // remove used dry day
            }

            fullLakes.add(lake);
            lastRainDay.put(lake, day);
        }
        return ans;
    }

    public static int findDryDay(List<Integer> dryDays, int lastRainDay) {
        int start = 0;
        int end = dryDays.size() - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (dryDays.get(mid) > lastRainDay) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] rains1 = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(avoidFlood(rains1)));

        int[] rains2 = { 1, 2, 0, 0, 2, 1 };
        System.out.println(Arrays.toString(avoidFlood(rains2)));

        int[] rains3 = { 1, 2, 0, 1, 2 };
        System.out.println(Arrays.toString(avoidFlood(rains3)));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_1488_AvoidFloodInTheCity.java && java M_1488_AvoidFloodInTheCity && del
// M_1488_AvoidFloodInTheCity.class
// [-1, -1, -1, -1]
// [-1, -1, 2, 1, -1, -1]
// []

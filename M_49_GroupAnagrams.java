// 01.11.2025
// https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=hash-table
// 49. Group Anagrams

import java.util.*;

public class M_49_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        List<List<String>> lists = new ArrayList<>();
        for (String key : map.keySet()) {
            lists.add(map.get(key));
        }
        return lists;
    }

    public static void main(String[] args) {
        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs1));

        String[] strs2 = { "" };
        System.out.println(groupAnagrams(strs2));

        String[] strs3 = { "a" };
        System.out.println(groupAnagrams(strs3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_49_GroupAnagrams.java && java M_49_GroupAnagrams && del
// M_49_GroupAnagrams.class
// [[eat, tea, ate], [bat], [tan, nat]]
// [[]]
// [[a]]
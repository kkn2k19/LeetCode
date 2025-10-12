// 12.10.2025
// https://leetcode.com/contest/weekly-contest-471/problems/longest-balanced-substring-i/description/
// Q2. Longest Balanced Substring I©leetcode

public class M_WC471Q2_LongestBalancedSubstringI {
    public static int longestBalanced(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a'] += 1;
                if (isBalanced(freq)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static boolean isBalanced(int[] freq) {
        int target = 0;
        for (int f : freq){
            if (f == 0) continue; // skip checking that char
            if (target == 0) target = f; // first non zero freq - will be the requierd for all to balance
            else if (f != target) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abbac";
        System.out.println(longestBalanced(s1));

        String s2 = "zzabccy";
        System.out.println(longestBalanced(s2));

        String s3 = "aba";
        System.out.println(longestBalanced(s3));
    }
}

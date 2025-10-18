// 17.10.2025
// https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-10-17
// 3330. Find the Original Typed String I

public class E_3330_FindTheOriginalTypedStringI {
    // wrong - not solved yet ---
    public static int possibleStringCount(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        int sum = 0;
        for (int f : freq) {
            if (f > 1) {
                sum += (f - 1);
            } else {
                sum += f;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String word1 = "abbcccc";
        System.out.println(possibleStringCount(word1));

        String word2 = "abcd";
        System.out.println(possibleStringCount(word2));

        String word3 = "aaaa";
        System.out.println(possibleStringCount(word3));
    }
}

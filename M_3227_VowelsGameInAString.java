// 24.10.2025
// https://leetcode.com/problems/vowels-game-in-a-string/description/?envType=daily-question&envId=2025-10-24
// 3227. Vowels Game in a String

public class M_3227_VowelsGameInAString {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean doesAliceWin(String s) {
        int vowels = 0;
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels += 1;
            }
        }
        // if vowels count is ODD - then alice removes all
        // - then 0 left - bob fails - alice wins
        // if vowels count is EVEN - then alice removes maxOdd vowels possible to remove
        // - 1 left - again bob fails - alice wins
        // conclusion if vowels > 0 - alice wins // if vowels == 0 then bob
        if (vowels > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "leetcoder";
        System.out.println(doesAliceWin(s1));

        String s2 = "bbcd";
        System.out.println(doesAliceWin(s2));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3227_VowelsGameInAString.java && java M_3227_VowelsGameInAString && del
// M_3227_VowelsGameInAString.class
// true
// false
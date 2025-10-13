// 14.10.2025
// https://leetcode.com/problems/to-lower-case/description/
// 709. To Lower Case

public class E_709_ToLowerCase {
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32); // a=97 A = 65 --> a-A = 97-65 = 32
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(toLowerCase(s1));

        String s2 = "here";
        System.out.println(toLowerCase(s2));

        String s3 = "LOVELY";
        System.out.println(toLowerCase(s3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_709_ToLowerCase.java && java E_709_ToLowerCase && del
// E_709_ToLowerCase.class
// hello
// here
// lovely
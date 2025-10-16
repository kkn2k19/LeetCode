// 16.10.2025
// https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/?envType=daily-question&envId=2025-10-16
// 2566. Maximum Difference by Remapping a Digit

public class E_2566_MaximumDifferenceByRemappingADigit {
    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);

        // max part
        char toReplace = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '9') {
                toReplace = ch;
                break;
            }
        }

        // String maxVal = "";
        // for (char ch : s.toCharArray()) {
        //     if (ch == toReplace) {
        //         maxVal += '9';
        //     } else {
        //         maxVal += ch;
        //     }
        // }
        String maxVal = (toReplace == 0) ? s : s.replace(toReplace, '9');
        int max = Integer.parseInt(maxVal);

        // min part
        toReplace = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                toReplace = ch;
                break;
            }
        }

        // String minVal = "";
        // for (char ch : s.toCharArray()) {
        //     if (ch == toReplace) {
        //         minVal += '0';
        //     } else {
        //         minVal += ch;
        //     }
        // }
        String minVal = (toReplace == 0) ? s : s.replace(toReplace, '0');
        int min = Integer.parseInt(minVal);

        return max - min;
    }

    public static void main(String[] args) {
        int num1 = 11891;
        System.out.println(minMaxDifference(num1));

        int num2 = 90;
        System.out.println(minMaxDifference(num2));

        int num3 = 911;
        System.out.println(minMaxDifference(num3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac E_2566_MaximumDifferenceByRemappingADigit.java && java E_2566_MaximumDifferenceByRemappingADigit && del E_2566_MaximumDifferenceByRemappingADigit.class
// 99009
// 99
// 988
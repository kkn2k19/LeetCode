// 10.04.2024
// https://leetcode.com/problems/happy-number/description/
// 202. Happy Number

import java.util.Scanner;
import java.util.Arrays;

public class 217.Contains_Duplicate {
    public static void main(String[] args) {
        # rest code
    }

    public boolean isHappy(int n) {
        int sum = n;
        while (sum > 9){
            n = sum;
            sum = 0;
            while (n > 0){
                int d = n%10;
                sum += d*d;
                n/=10;
            }
        }
        if (sum == 1 || sum == 7){ // here i have taken help from GPT
            return true;
        }
        return false;
    }
}

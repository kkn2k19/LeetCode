// 02.04.2024
// https://leetcode.com/problems/sqrtx/
// 69. Sqrt(x)

import java.util.Scanner;

public class 69.Sqrt(x) {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    System.out.println("Square Root Value : " + mySqrt(n));
  }
  static int mySqrt(int x) {
    int sqrt = (int)Math.sqrt(x);
    return sqrt;
  }
}

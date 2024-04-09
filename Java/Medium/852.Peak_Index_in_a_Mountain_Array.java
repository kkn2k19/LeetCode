// 09.04.2024
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// 852. Peak Index in a Mountain Array

public class 74.Search_a_2D_Matrix {
  public static void main(String[] args) {
    # rest code
  }
  public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

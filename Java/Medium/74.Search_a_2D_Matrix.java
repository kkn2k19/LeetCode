// 02.04.2024
// https://leetcode.com/problems/search-a-2d-matrix/
// 74. Search a 2D Matrix

public class 74.Search_a_2D_Matrix {
  public static void main(String[] args) {
    int[][] matrix = {
      {1,3,5,7},
      {10,11,16,20},
      {23,30,34,60}
    };
    int target = 3;
    System.out.println(searchMatrix(matrix, target));
  }
  public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length; i++){
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]) {
                int start = 0;
                int end = matrix[0].length - 1;
                while(start <= end) {
                    int mid = start + (end-start)/2;
                    if (matrix[i][mid]==target) {
                        return true;
                    } else if (matrix[i][mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1; 
                    }
                }
            }
        }
        return false;
    }
}

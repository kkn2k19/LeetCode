import java.util.*;

public class M_274_HIndex {
    public static int hIndex(int[] citations) {
        /* 
        // Arrays.sort(citations, Collections.reverseOrder()); // this works for
        // Integer[] arrays
        citations = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        // System.out.println(Arrays.toString(citations));
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1)
                h = i + 1;
            else
                break;
        }
        return h;
        */ 
        // THAT WAS DESCENDING APPROACH- now trying with ascending order
        // here we will check first index where no.of papers remaining <= arr[i] -- citations at that point should be equal or more from no.of papers at the point that means this is valid 
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++){
            int remaining = n-i;
            if (citations[i] >= remaining) {
                h = remaining;
                break;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int[] citations = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(citations));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_274_HIndex.java && java M_274_HIndex && del M_274_HIndex.class
// 3
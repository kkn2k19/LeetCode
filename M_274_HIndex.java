import java.util.*;

public class M_274_HIndex {
    public static int hIndex(int[] citations) {
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
    }

    public static void main(String[] args) {
        int[] citations = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(citations));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_274_HIndex.java && java M_274_HIndex && del M_274_HIndex.class
// 3
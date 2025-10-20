// 21.10.2025
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
// 2011. Final Value of Variable After Performing Operations

public class E_2011_FInalValueOfVariableAfterPerformingOperations {
    // O(N) -- 1ms
    // public static int finalValueAfterOperations(String[] operations) {
    //     int res = 0;
    //     for (String s : operations) {
    //         if (s.equals("++X") || s.equals("X++")) {
    //             res += 1;
    //         }
    //         if (s.equals("--X") || s.equals("X--")) {
    //             res -= 1;
    //         }
    //     }
    //     return res;
    // }

    // O(logN) -- 1ms
    public static int finalValueAfterOperations(String[] operations){
        int res = 0;
        int start = 0;
        int end= operations.length - 1;
        while (start <= end) {
            if (start == end){
                String s = operations[start];
                if (s.equals("++X") || s.equals("X++"))
                    res += 1;
                if (s.equals("--X") || s.equals("X--"))
                    res -= 1;
                break;
            }
            String s1 = operations[start];
            if (s1.equals("++X") || s1.equals("X++"))
                res += 1;
            if (s1.equals("--X") || s1.equals("X--"))
                res -= 1;
            String s2 = operations[end];
            if (s2.equals("++X") || s2.equals("X++"))
                res += 1;
            if (s2.equals("--X") || s2.equals("X--"))
                res -= 1;
            start += 1;
            end -= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] operations1 = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(operations1));

        String[] operations2 = { "++X", "++X", "X++" };
        System.out.println(finalValueAfterOperations(operations2));

        String[] operations3 = { "X++", "++X", "--X", "X--" };
        System.out.println(finalValueAfterOperations(operations3));
    }
}

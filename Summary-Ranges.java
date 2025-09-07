
// import java.util.StringBuilder; already imported in util.* packages
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i += 1;
            }
            int end = nums[i];

            StringBuilder sb = new StringBuilder();
            sb.append(start);
            if (start != end) {
                // sb.append("->" + end);
                sb.append("->");
                sb.append(end);
            }
            list.add(sb.toString());
        }
        return list;
    }
}
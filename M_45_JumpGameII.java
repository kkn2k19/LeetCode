public class M_45_JumpGameII {
    public static int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int max = 0;
        int currentRange = 0;
        for (int i = 0; i < n-1; i++){ // n-1 -> no jumps from last index
            max = Math.max(max, i + nums[i]);
            if (i == currentRange){
                jumps += 1;
                currentRange = max;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 0, 1, 4 };
        System.out.println(jump(nums));
    }
}

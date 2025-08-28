class Solution {
    public void sortColors(int[] nums) {
        int start = 0; // index for zeroes
        int mid = 0; // points to current element 
        int end = nums.length - 1; // index for 2s

        while (mid <= end){
            if (nums[mid] == 0) {
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                mid += 1;
                start += 1;
            } else if (nums[mid] == 1) {
                mid += 1;  // no need to do anything for 1 when 0 and 2 got sorted 1 will automatically come to real places
            } else if (nums[mid] == 2) {
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end -= 1;
            }
        }
    }
}
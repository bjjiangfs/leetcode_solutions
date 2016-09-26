public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % nums.length;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }
    public void reverse(int[] nums, int start, int end){
        int i = start, j = end, val;
        while(i<j){
            val = nums[i];
            nums[i] = nums[j];
            nums[j] = val;
            i++;
            j--;
        }
    }
}
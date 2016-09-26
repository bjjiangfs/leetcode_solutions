public class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0, cur = 0, val; i < nums.length ; i++){
            if(nums[i] != 0){
                val = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = val;
            }
        }
    }
}
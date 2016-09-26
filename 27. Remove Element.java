public class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for(int n : nums){
            if(n != val){
                nums[pointer++] = n;
            }
        }
        return pointer;
    }
}
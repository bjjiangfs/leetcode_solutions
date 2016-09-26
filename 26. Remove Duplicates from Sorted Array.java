public class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0)
            return 0;
       
        int prevPointer = 0;
       
        for (int n : nums) {
            if (n != nums[prevPointer]) {
                nums[++prevPointer] = n;
            }
        }
        return prevPointer+1;
        
    }
}
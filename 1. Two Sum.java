public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            complement = target-nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),i};
            }else{
                 numMap.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
       
    }
}
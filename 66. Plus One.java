public class Solution {
    public int[] plusOne(int[] digits) {
        
        digits[digits.length-1]++;
        for(int i = digits.length-1; i > 0 ; i--){
            if(digits[i]>=10){
                digits[i-1]++;
                digits[i]-=10;
            }
        }
        if(digits[0]<10)
            return digits;
        else{
            int[] result = new int[digits.length+1];
            result[0] = 1;
            digits[0] -= 10;
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        }
    }
}
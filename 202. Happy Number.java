public class Solution {
    public boolean isHappy(int n) {
        int[] square = new int[]{0,1,4,9,16,25,36,49,64,81};
        HashSet<Integer> set = new HashSet<Integer>();
        int sum, i, temp;
        while(n != 1){
            
            if(set.contains(n)) // if n is in set then return false
                return false;
            else    // else set.put(n)
                set.add(n);
            
            sum = 0 ;
            temp = n;
            // calculate sum
            while( temp != 0 ){
                sum += (temp%10)*(temp%10);
                temp /= 10;
            }
            n = sum;
        }
        return true; 
    }
}
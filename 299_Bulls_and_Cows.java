
import java.util.*;

public class Solution {
    public String getHint(String secret, String guess) {
        int[] hash = new int[10];
        int a=0,b=0,s, g,sum=0;
        for (int i = 0; i < secret.length(); i++) {
            s = secret.charAt(i) - '0';
            g = guess.charAt(i) - '0';
            if( s == g)
                a++;
            else{
                hash[s]++;
                hash[g]--;
            }
        }

        for(int i = 0 ; i < 10 ; i++)
            sum += Math.abs(hash[i]); 

        b = (2*secret.length() - sum)/2 - a;

        return Integer.toString(a) + "A" + Integer.toString(b) + "B";
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String r = s.getHint("11","10");
        
        System.out.println(r);
        
    }
}
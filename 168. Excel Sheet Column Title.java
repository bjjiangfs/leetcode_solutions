public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int remainder;
        char c;
        while( n != 0 ){
        	remainder = (n-1) % 26;
        	c = (char)(remainder + 'A');
        	sb.append(c);
        	n = (n-1)/26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
    	Solution s = new Solution();
    	String result = s.convertToTitle(Integer.parseInt(args[0]));
    	System.out.println(result);
    }
}
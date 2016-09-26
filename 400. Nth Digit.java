public class Solution {
    public int findNthDigit(int nn) {
        long w = 1, temp = 1, x, divisor, remainder;
        long n = (long)nn;
        while(n-9*temp*w >= 0){
            temp *= 10;
            w++;
        }
        
        temp = 1;
       
        for(long i = 1 ; i < w ; i++){
            n = n - 9*temp*i;
            temp *= 10;
        }

        x = (long) Math.pow(10,(w-1));

        System.out.println("number length: " + w);
        System.out.println("start from : " + x);
        System.out.println("n digits to go from " + x +" : " + n);


        x = x + (long)Math.ceil((double)n/(double)w)-1;

        System.out.println("number : " + x);
        remainder = n % w;
        if(remainder == 0)
            remainder = w;

        divisor = (long)Math.pow(10, (w-remainder));

        return (int)(x/divisor%10);
    }
}
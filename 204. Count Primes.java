public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n ; i++) {
            isPrime[i] = true;
        }
       
        for(int i = 2 ; i * i < n ; i++){
            if(!isPrime[i]) continue;
            for (int j = i ; i * j < n ; j++) {
               
                isPrime[i*j] = false;
            }
        }

        int counter = 0;
        for (int i = 2; i < n; i++) {
            
            if(isPrime[i]) counter++;
        }
        return counter;
    }
}
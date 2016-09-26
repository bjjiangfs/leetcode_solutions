public class Solution {
    public char findTheDifference(String s, String t) {
        int[] sLetters = new int[26];
        int[] tLetters = new int[26];
        for(int i = 0 ; i < 26 ; i++)
        {
            sLetters[i] = 0;
            tLetters[i] = 0;
        }
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            sLetters[(int)(s.charAt(i)-97)] ++;
        }
        for(int i = 0 ; i < t.length() ; i++)
        {
            tLetters[(int)(t.charAt(i)-97)] ++;
        }
        
        for(int i = 0 ; i < 26 ; i++)
        {
            if(sLetters[i] != tLetters[i])
            {
                return (char)(i+97);
            }
        }
        
        for(int i = 0 ; i < 26 ; i++)
        {
            System.out.println(sLetters[i]+" "+tLetters[i]);
        }
        return 'a';
    }
}
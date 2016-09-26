public class Solution {
    public boolean wordPattern(String pattern, String str) {
       String[] s = str.split(" ");
        int index = 0;
        char p;
       
        HashMap<Character, String> map = new HashMap<Character, String>();
        boolean result = true;
       
        if(pattern.length() != s.length)
            return false;

        for (String word : s) {
            p = pattern.charAt(index);
            
            if( map.containsKey(p) && !map.get(p).equals(word) )
                return false;
            if( !map.containsKey(p) && map.containsValue(word) )
                return false;
            map.put(p,word);
            index++;
        }
        return result;
    }
}
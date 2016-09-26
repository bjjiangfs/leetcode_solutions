public class Solution {
    public boolean isAnagram(String s, String t) {
       char cs,ct;
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0 ; i < s.length() ; i++){
            cs = s.charAt(i);
            if(map.containsKey(cs)) map.put(cs, map.get(cs)+1);
            else map.put(cs, 1);

            ct = t.charAt(i);
            if(map.containsKey(ct)) map.put(ct, map.get(ct)-1);
            else map.put(ct, -1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue().intValue() != 0)
                return false;
        }
            return true;
    }
}
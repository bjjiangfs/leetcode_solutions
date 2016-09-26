public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char cs,ct;
        for (int i = 0 ; i < s.length() ; i++) {
            cs = s.charAt(i);
            ct = t.charAt(i);
            if(map.containsKey(cs) && map.get(cs).charValue() != ct)
                return false;
            if(!map.containsKey(cs) && map.containsValue(ct))
                return false;
            map.put(cs,ct);
        }
        return true;
    }
}
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
import java.util.LinkedHashMap;

public class B03_First_Unique_Character_in_a_String {
    class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
}

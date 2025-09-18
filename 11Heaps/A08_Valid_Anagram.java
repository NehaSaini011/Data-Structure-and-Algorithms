// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.HashMap;

public class A08_Valid_Anagram {
    class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)||map.get(c)<=0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}
}

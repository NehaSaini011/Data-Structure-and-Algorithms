// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.


import java.util.HashMap;

public class A07_Ransom_Note {
    class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        // HashMap<Character,Integer> mag = new HashMap<>();

        // for(int i = 0;i<ransomNote.length();i++){
        //     map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
        // }
        for(char c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }


        // for(int i = 0;i<magazine.size();i++){
        //     mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i),0)+1);
        // }
        // for(int j = 0;j<magazine.size();j++){
        //     if(map.get(ransomNote.charAt(i))==)
        // }

        // for(char c : m)
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c)|| map.get(c)<=0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}
}

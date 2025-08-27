// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

public class B02_Check_if_two_string_arrays_are_equivalent{
    class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1String = "";
        String word2String = "";
        boolean flag = false;
        for(int i = 0;i<word1.length;i++){
            word1String += word1[i];
        }
        for(int j = 0;j<word2.length;j++){
            word2String += word2[j];
        }
       
        return word1String.equals(word2String);
    }
}
}
// A word is considered valid if:

// It contains a minimum of 3 characters.
// It contains only digits (0-9), and English letters (uppercase and lowercase).
// It includes at least one vowel.
// It includes at least one consonant.
// You are given a string word.

// Return true if word is valid, otherwise, return false.

// Notes:

// 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
// A consonant is an English letter that is not a vowel.

public class A04_valid_word {
    class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        // boolean isValid = false;
        if(n<3){
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        // for(int i = 0;i<n;i++){
        //     // if(char == "@" || "!" || "#" || "$"||"%"||"^"||"&"||"*"||"("||")"){
        //     //     return false:
        //     // }
        //     char ch = word.charAt(i);
        //     if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='1' && ch<='9' ){
        //         if(ch == 'a' ||ch == 'A' || ch =='e'||ch =='E' ||ch =='i'||ch =='I'||ch =='o'||ch =='O'||ch =='u'||ch =='U'){
        //         isValid = true;
        //     }
        //     else{
        //         isValid = false;
        //     }
        //     }
        //     else{
        //         return false;
        //     }
        // }
        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                char ch = Character.toLowerCase(c);
                if(
                    ch == 'a'||
                    ch == 'e'||
                    ch == 'i'||
                    ch == 'o'||
                    ch == 'u'
                ){
                    hasVowel = true;
                }else{
                    hasConsonant = true;
                }
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        // return isValid;
        return hasVowel && hasConsonant;
    }
}
}

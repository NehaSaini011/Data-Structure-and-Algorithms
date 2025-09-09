import java.util.ArrayList;
import java.util.List;

public class A06Keyboard_row {
    class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String rows[] = {"qwertyuiop","asdfghjkl","zxcvbnm"};

        for(String word : words){
            String lower = word.toLowerCase();
            for(String row : rows){
                if(isValid(row,lower)){
                    result.add(word);
                }
            }
        }
        return result.toArray(new String[0]);

    }
    private boolean isValid(String row, String word){
        for(char c : word.toCharArray()){
            if(row.indexOf(c)<0) return false;
        }
        return true;
    }
}
}

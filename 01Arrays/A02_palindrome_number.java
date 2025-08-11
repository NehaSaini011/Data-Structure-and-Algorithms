// Given an integer x, return true if x is a palindrome, and false otherwise.
public class A02_palindrome_number {
    class Solution {
    public boolean isPalindrome(int x) {
       int reverse = 0;
       int original = x;
       if(x<0){
        return false;
       }
    //    int new_No = x%10;
    //    if(new_No >= 0){
    //    reverse = reverse*10 + new_No;
    //    new_No = new_No/10;
    //    }
       while(x != 0){
       int new_No = x%10;
       reverse = reverse*10 + new_No;
       x = x/10;
       }
       if(original == reverse){
        return true;
       }
       return false;
    }
}
}

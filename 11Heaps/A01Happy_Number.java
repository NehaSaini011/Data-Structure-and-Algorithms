// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

import java.util.*;
public class A01Happy_Number {
    class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n!=1){
            if(!set.contains(n)){
                set.add(n);
                int sum = 0;
                int temp = n;
                while(temp!=0){
                    int rem = temp%10;
                    sum+=rem*rem;
                    temp/=10;
                }
                n = sum;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
}

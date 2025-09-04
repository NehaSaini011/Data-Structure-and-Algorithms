// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.*;
public class A03MissingNumber {
    class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        // Step1: Add all numbers to the set
        for(int num:nums){
            set.add(num);
        }
        // Step2: Check which number in [0,n] is missing
        for(int i = 0;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
        
    }
}
}

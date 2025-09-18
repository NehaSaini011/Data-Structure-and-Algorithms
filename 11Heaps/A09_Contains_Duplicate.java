// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashMap;

public class A09_Contains_Duplicate {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        boolean isTwice = false;
        for(int n:nums){
            Map.put(n,Map.getOrDefault(n,0)+1);
        }
        for(int n=0;n<nums.length;n++){
            if(Map.get(nums[n]) >= 2){
                isTwice = true;
            }
            
        }
        return isTwice;
    }
}
}

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 
import java.util.*;
public class A02Majority_Element {
    class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
       int res = 0;
       int majority = 0;
       for(int n : nums){
        map.put(n,1+map.getOrDefault(n,0));
        if(map.get(n)>majority){
            res = n;
            majority = map.get(n);
        }
       }
       return res;
    }
}
}

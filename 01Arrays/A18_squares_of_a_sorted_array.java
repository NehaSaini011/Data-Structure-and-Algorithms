// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

public class A18_squares_of_a_sorted_array {
    class Solution {
    public int[] sortedSquares(int[] nums) {
        // int newArr []=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
}

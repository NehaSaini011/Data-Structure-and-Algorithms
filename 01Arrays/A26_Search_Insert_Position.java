// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity. 

public class A26_Search_Insert_Position {
    class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary Search
        int n = nums.length;
        int left = 0;
        int right = n-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
}

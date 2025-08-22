// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.
public class A12_binarySearch {
    class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
                
            }else if(target > nums[mid]){
               start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
}

// You are given a 0-indexed integer array nums and a target element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
import java.util.ArrayList;
import java.util.List;

public class A13_find_target_indices_after_sorting_array {
    class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Implementing bubble sort for sorting in inc order
        for(int i = 0;i<nums.length-1;i++){
            for(int j = 0+i ;j<nums.length;j++){
                if(nums[i]>=nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // Linear search
        List l = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                l.add(i);
            }
        }
        return l;
    }
}
}

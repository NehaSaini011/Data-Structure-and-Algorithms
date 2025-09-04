// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

import java.util.Arrays;

public class A22_remove_duplicates_from_sorted_array {
    class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 1;
        int k = 0;
        if(n == 1){
            return 1;
        }
        while(l<n && r<=n-1){
            if(nums[l] == nums[r]){
                nums[r] = Integer.MAX_VALUE;
                r++;
            }else if(nums[l]!=nums[r]){
                l++;
                if(l==r){
                    r++;
                }
            }
        }
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(nums[i]<1000){
                k++;
            }
        }
        return k;

    }
}
}

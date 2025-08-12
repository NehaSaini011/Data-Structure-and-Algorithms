// An array is considered special if the parity of every pair of adjacent elements is different. In other words, one element in each pair must be even, and the other must be odd.
// You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

public class A03_special_array_I{
    class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        Boolean isSpecial = false;
        if(n == 1){
            isSpecial = true;
            return isSpecial;
        }
        if(nums[0]%2 == 0){
            // Checkinh for even
            for(int i = 0 ;i<n;i+=2){
                if(nums[i]%2 == 0){
                    isSpecial = true;
                }else{
                    isSpecial = false;
                    return isSpecial;
                    
                }
            }
            // Checking for odd
            for(int i = 1; i<n ;i+=2){
                if(nums[i]%2 != 0){
                    isSpecial = true;
                }
                else{
                    isSpecial = false;
                    return isSpecial;
                   
                }
            }
        }else{
            // Checking for odd
            for(int i = 0; i<n ;i+=2){
                if(nums[i]%2 != 0){
                    isSpecial = true;
                }
                else{
                    isSpecial = false;
                    return isSpecial;
                   
                }
            }
            // Checkinh for even
            for(int i = 1 ;i<n;i+=2){
                if(nums[i]%2 == 0){
                    isSpecial = true;
                }else{
                    isSpecial = false;
                    return isSpecial;
                    
                }
            }
        }
        return isSpecial;
    }
}
}
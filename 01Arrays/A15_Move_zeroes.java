public class A15_Move_zeroes {
    class Solution {
    public void moveZeroes(int[] nums) {
        // int n = nums.length;
        // int nonZeroPointer = 0;
        // int zeroPointer = 0;
        // while( nonZeroPointer < n-1){
        //     if(nums[zeroPointer] != 0){
        //         zeroPointer++;
        //     }
        //     if(nums[nonZeroPointer] == 0){
        //         nonZeroPointer++;
        //     }
        //     if(nums[zeroPointer] == 0 && nums[nonZeroPointer] != 0){
        //         int temp = nums[zeroPointer];
        //         nums[zeroPointer] = nums[nonZeroPointer];
        //         nums[nonZeroPointer] = temp;
        //     }
        // }
       int left = 0;
       for(int right = 0;right<nums.length;right++){
        if(nums[right] != 0){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
        }
       }
    }
}
}

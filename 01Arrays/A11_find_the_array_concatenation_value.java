// You are given a 0-indexed integer array nums.
// The concatenation of two numbers is the number formed by concatenating their numerals.
// For example, the concatenation of 15, 49 is 1549.
// The concatenation value of nums is initially equal to 0. Perform this operation until nums becomes empty:
// If nums has a size greater than one, add the value of the concatenation of the first and the last element to the concatenation value of nums, and remove those two elements from nums. For example, if the nums was [1, 2, 4, 5, 6], add 16 to the concatenation value.
// If only one element exists in nums, add its value to the concatenation value of nums, then remove it.
// Return the concatenation value of nums.
public class A11_find_the_array_concatenation_value {
    class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int start = 0;
        int last = nums.length-1;
        // because the length can be very long 
        long concatenationValue = 0;
        // and therefore the length would be long
        long n = nums.length;
        for(int i = 0; i<((nums.length)/2);i++){
            String Digit = String.valueOf(nums[start])+String.valueOf(nums[last]);
           
            concatenationValue+=Long.parseLong(Digit);
            
            nums[start] = 0;
            nums[last] = 0;
            start++;
            last--;
        }
        if(n%2 != 0){
            concatenationValue+=nums[(nums.length)/2];
        }

        return concatenationValue;
    }
}
}

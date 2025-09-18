// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
// The tests are generated such that there is exactly one solution. You may not use the same element twice.
// Your solution must use only constant extra space.

public class A28_Two_SumII_Input_Array_is_Sorted {
    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Creatin the solution array
        int myArray[] = new int[2];
        for(int i = 0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                myArray[0] = i+1;
                myArray[1] = j+1;
                return myArray;
                }
            }
        }
        


        return myArray;
    }
}
}

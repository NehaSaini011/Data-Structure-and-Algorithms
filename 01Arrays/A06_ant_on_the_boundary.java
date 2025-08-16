// An ant is on a boundary. It sometimes goes left and sometimes right.
// You are given an array of non-zero integers nums. The ant starts reading nums from the first element of it to its end. At each step, it moves according to the value of the current element:
// If nums[i] < 0, it moves left by -nums[i] units.
// If nums[i] > 0, it moves right by nums[i] units.
// Return the number of times the ant returns to the boundary.
// Notes:
// There is an infinite space on both sides of the boundary.
// We check whether the ant is on the boundary only after it has moved |nums[i]| units. In other words, if the ant crosses the boundary during its movement, it does not count.
 
public class A06_ant_on_the_boundary {
    class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int distanceCovered = 0;
        int count = 0;
        if(n==1){
            return 0;
        }    
        for(int i = 0;i<n;i++){
            distanceCovered+=nums[i];
            if(distanceCovered == 0){
                count++;
            }
        }
        return count;
    }
}
    
}
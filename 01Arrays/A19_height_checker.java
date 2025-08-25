// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
// Return the number of indices where heights[i] != expected[i].

import java.util.Arrays;

public class A19_height_checker {
    class Solution {
    public int heightChecker(int[] heights) {
      int count = 0;
      int expected[] = new int[heights.length];
      for(int  i = 0;i<heights.length;i++){
        expected[i] = heights[i];
      }
      Arrays.sort(expected);
      for(int j = 0;j<heights.length;j++){
        if(heights[j] != expected[j]){
            count++;
        }
      }
      return count;

    }
}
}

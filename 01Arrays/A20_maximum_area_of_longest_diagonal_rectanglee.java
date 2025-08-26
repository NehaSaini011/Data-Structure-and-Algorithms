// You are given a 2D 0-indexed integer array dimensions.
// For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.
// Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.
public class A20_maximum_area_of_longest_diagonal_rectanglee{
    class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // int currDiagLen = 0;
        // int diagLen = 0;
        // int currArea = 0;
        // int maxArea = 0;
        // for(int i = 0;i<dimensions.length;i++){
        //     currDiagLen = (int)Math.sqrt((dimensions[i][0] * dimensions[i][0]) +(dimensions[i][1] * dimensions[i][1]) );
        //     currArea = dimensions[i][0]*dimensions[i][1];
        //     if(diagLen != currDiagLen){
        //         diagLen = Math.max(diagLen,currDiagLen);
        //         maxArea = Math.max(currArea,maxArea);
        //     }else if(diagLen == currDiagLen){
        //         diagLen = currDiagLen;
        //         maxArea = currArea;
        //     }
        // }
        int maxDiaSq = 0;
        int maxArea = 0;
        for(int [] dim:dimensions){
            int l = dim[0];
            int w = dim[1];
            int diaSq = l*l+w*w;
            int area = l*w;
            if(diaSq>maxDiaSq){
                maxDiaSq = diaSq;
                maxArea = area;
            }else if(diaSq == maxDiaSq){
                maxArea = Math.max(maxArea,area);
            }
        }
         return maxArea;
    }
}
}
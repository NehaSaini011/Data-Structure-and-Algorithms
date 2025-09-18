import java.util.ArrayList;
import java.util.Collections;

public class A24_Diagonal_Traverse {
    class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Check for empty matrices
        if(mat == null || mat.length == 0){
            return new int[0];
        }
        // Variables to track the size of the matrix
        int N = mat.length;
        int M = mat[0].length;

        // The two arrays as explained in the algorithm
        int[] result = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate  = new ArrayList<Integer>();

        // We have to go over all the elements in the first
        // row and the last column to cover all possible diagonals
        for(int d = 0;d<N+M-1;d++){
            // Clear the intermediate array every time we start
            // to process another diagonal
            intermediate.clear();



            int r = d<M? 0 : d-M+1;
            int c = d<M?d:M-1;


            while(r<N && c>-1){
                intermediate.add(mat[r][c]);
                ++r;
                --c;
            }
            if(d%2==0){
                Collections.reverse(intermediate);
            }
            for(int i =0;i<intermediate.size();i++){
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}
}

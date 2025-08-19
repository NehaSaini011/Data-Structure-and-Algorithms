import java.util.ArrayList;

public class A09_mergeTwo2D_aaraysBy_Summing_Values {
    class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<int[]> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;j++;
            }else if(nums1[i][0] > nums2[j][0]){
                list.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
        }
        while(i<nums1.length){
            list.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<nums2.length){
            list.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        int relevantArray[][] = new int[list.size()][];
        for(int w = 0;w<list.size();w++){
            relevantArray[w] = list.get(w);
        }

        return relevantArray;

    }
}
}

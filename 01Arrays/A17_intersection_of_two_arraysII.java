// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A17_intersection_of_two_arraysII {
    // Dry run your written program for all the given example testcases
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sorting arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int idx1 = 0;
        int idx2 = 0;
        // As we have to return an array,direct formation of array not possible as we dont know the resulting array size,therefore making a list and later on converting it to an array
        List<Integer> list = new ArrayList<>();
        // int [] arr = new int[len];
        while(idx1 < n1 && idx2 < n2){
                if(nums1[idx1] == nums2[idx2]){
                    list.add(nums1[idx1]);
                    idx1++;
                    idx2++;
                }else if(nums1[idx1] > nums2[idx2]){
                    idx2++;
                }else{
                    idx1++;
                }
            }
            // converting list to arrray
            int [] arr = new int[list.size()];
            for(int i = 0;i<list.size();i++){
                arr[i] = list.get(i);
            }
           return arr;
        }
        
    }

}

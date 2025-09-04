import java.util.HashSet;

public class A04Intersection_of_twoArrays {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        // int idx1 = 0, idx2 = 0;
        // int n1 = nums1.length, n2 = nums2.length;
        // while(idx1 < n1 && idx2 < n2){
        //     if(nums1[idx1] == nums2[idx2]){
        //         set.add(nums1[idx1]);
        //         idx1++;idx2++;
        //     }else if(nums1[idx1]>nums2[idx2]){
        //         idx1++;
        //     }else{
        //         idx2++;
        //     }
        // }
        // int n = set.size();
        // int newArr[] = new int[n];
        // int i = 0;
        // for(int num:set){
        //     newArr[i++] = num;
        // }
       
        // return newArr;

        for(int num:nums1){
            set1.add(num);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int newArr[] = new int[set2.size()];
        int i = 0;
        for(int ele : set2){
            newArr[i++] = ele;
        }

        return newArr;
    }
}
}

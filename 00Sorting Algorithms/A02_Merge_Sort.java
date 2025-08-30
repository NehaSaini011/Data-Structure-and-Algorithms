public class A02_Merge_Sort {
    class Solution {
        public void merge(int nums[],int left,int mid,int right){
            // Find sizes of two subarrays   
            int n1 = mid-left+1;
            int n2 = right-mid;

            // Create temp arrays
            int L[] = new int[n1];
            int R[] = new int[n2];
            
            // Copy data to temp array
            for(int i = 0;i<n1;i++){
                L[i] = nums[left+i];
            }
            for(int j = 0;j<n2;j++){
                R[j] = nums[mid+1+j];
            }
            // Merge temp arrays back into nums[left..right]
            int i = 0,j = 0;
            int k = left;
            while(i<n1 && j<n2){
                if(L[i]<=R[j]){
                    nums[k] = L[i];
                    i++;
                }else{
                    nums[k] = R[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                nums[k] = L[i];
                i++;k++;
            }
            while(j<n2){
                nums[k] = R[j];
                j++;k++;
            }
        }

       public void sort(int nums[], int left, int right){
            // base condition 
            if(left<right){
                int mid = (left+right)/2;

                // Recursively sorting first and second halves
                sort(nums,left,mid);
                sort(nums,mid+1,right);

                // Merge the sorted halves
                merge(nums,left,mid,right);
            }
        }
        public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
}
}

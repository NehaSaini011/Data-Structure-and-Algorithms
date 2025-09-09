public class A23_FindN_Unique_Integers_Sum_up_toZero {
    class Solution {
    public int[] sumZero(int n) {
        int [] res = new int[n];
        int index = 0;
        for(int i = 1;i<=n/2;++i){
            res[index++] = i;
            res[index++] = -i;
        }
        if(n%2 == 1){
            res[index] = 0;
        }
        return res;
    }
}
}

// Given an integer n, return any array containing n unique integers such that they add up to 0.
public class A27_Find_N_Unique_Integers_Sum_uptoZero {
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

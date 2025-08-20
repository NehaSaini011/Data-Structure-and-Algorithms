public class A10_maximum_difference_by_remapping_a_digit {
    class Solution {
    public int minMaxDifference(int num) {
        // String maxNum = Integer.toString(num);
        // String minNum = Integer.toString(num);
        // int min = 9;
        // int max = 0;
        // // Keeping a copy so that second loop can run
        // int temp = num;
        // while(temp>0){
        //     int digit = temp%10;
        //     min = Math.min(min,digit);
        //     temp = temp/10;
        // }
        // temp = num;
        // while(temp>0){
        //     int digit = temp%10;
        //     max = Math.min(max,digit);
        //     temp = temp/10;
        // }
        // String minStr = Integer.toString(min);
        // String maxStr = Integer.toString(max);
        // // Finding out the max nummber
        // for(int i = 0;i<maxNum.length();i++){
        //     if(String.valueOf(maxNum.charAt(i)).equals(minStr)){
        //        maxNum = maxNum.substring(0,i) + "9" +maxNum.substring(i+1);
        //     }
        // }
        // // Finding out the min number
        // for(int i = 0;i<minNum.length();i++){
        //     if(String.valueOf(minNum.charAt(i)) == maxStr){
        //         // String.valueOf(minNum.charAt(i)) = "0";
        //         minNum = minNum.substring(0,i) + "0" +minNum.substring(i+1);
        //     }
        // }
        // int diff = Integer.parseInt(maxNum) - Integer.parseInt(minNum);
        // return diff;

        // Greedy Algo

        String s = Integer.toString(num);
        String t = s;
        int pos = 0;
        while(pos<s.length()&&s.charAt(pos) == '9'){
            pos++;
        }if(pos<s.length()){
            s = s.replace(s.charAt(pos),'9');
        }
        t = t.replace(t.charAt(0),'0');
        return Integer.parseInt(s) - Integer.parseInt(t);
    }
}
}

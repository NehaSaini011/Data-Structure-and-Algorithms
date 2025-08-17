// You are given a binary string s that contains at least one '1'.
// You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
// Return a string representing the maximum odd binary number that can be created from the given combination.
// Note that the resulting string can have leading zeros.

import java.util.Arrays;

public class A07_maximum_odd_binary_number {
    class Solution {
    public String maximumOddBinaryNumber(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        Arrays.sort(arr);
        int secondLast = n-2;
        for(int i = 0;i<n/2;i++){
            char temp = arr[i];
            arr[i] = arr[secondLast-i];
            arr[secondLast-i] = temp;
        }
        return new String(arr);

    }
}
}

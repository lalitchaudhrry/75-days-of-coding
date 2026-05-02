import java.util.Arrays;

class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int n = arr.length;
        if(n<3) return -1;
        Arrays.sort(arr);
        return arr[n-3];
      
    }   //thoda stupid question 
}
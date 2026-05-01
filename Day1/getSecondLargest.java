import java.util.Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        //base case
        int n = arr.length;
        Arrays.sort(arr);
        // we do know n-1 will always be largest so we need to check before that
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i]; // second largest element 
            }
            else {
                continue;
            }
        }
        return -1;
    }
}
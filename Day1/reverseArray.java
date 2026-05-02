class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int start = 0;
        int end = n-1;
        // we played with indices only 
        
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
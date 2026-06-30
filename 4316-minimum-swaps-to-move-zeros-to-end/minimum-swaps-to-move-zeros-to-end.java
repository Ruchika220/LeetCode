class Solution {
    public int minimumSwaps(int[] arr) {
     int j=0;
     int n = arr.length;
     int count = 0;
     for(int i=n-1; i>0; i--){
        while(j < n && arr[j] != 0) {
                j++;
            }
        if(j < i && j < n && arr[j] == 0 && arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
           count++;
        }
       // j++;
     }   
        return count;
    }
}
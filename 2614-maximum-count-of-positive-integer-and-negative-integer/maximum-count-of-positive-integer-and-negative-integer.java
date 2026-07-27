// class Solution {
//     public int maximumCount(int[] nums) {

//          int n=nums.length;
//         // int i=0;
//         // int j = n-1;
//          int pcount =0;
//          int ncount=0;

//         // while(i<=j){
//         //     int mid = i+(j-i)/2;
            
//         //     if(nums[mid]>0){
//         //         count++;
//         //     }
//         //     else{
//         //         mid = mid+1;
//         //     }
//         // }
//         // return count;


//         for(int i=0; i<n; i++){
//             if(nums[i]>0 ){
//                 pcount++;
//             }
//             else(nums[i]<0){
//                 ncount++;
//             }
           
//         }
//         return Math.max(pcount, ncount);
//     }
// }


class Solution {
    public int maximumCount(int[] nums) {

        int pcount = 0;
        int ncount = 0;

        for (int num : nums) {
            if (num > 0) {
                pcount++;
            } else if (num < 0) {
                ncount++;
            }
        }

        return Math.max(pcount, ncount);
    }
}
// _______________________________________________________________ Time complexity- O( max element * n), space complexity- O(1) 
// public class Solution {  
//     public static int findMax(int v[]){
//         int maxi = Integer.MIN_VALUE;

//         for(int i=0; i<v.length; i++){
//             if(v[i]> maxi) maxi = v[i];
//         }
//         return maxi;
//     }
//     public static int minimumRateToEatBananas(int []v, int h) {
//         int maxi = findMax(v);
//         for(int i=1; i<=maxi; i++){
//             int sum = 0;

//             for(int j=0;j<v.length; j++){
//                 int temp = (int)Math.ceil((double)v[j] / i);
//                 sum +=temp;
//             }
//             if(sum<= h){
//                 return i;
//             }
//         }
//         return maxi;
//     }
// }



// _______________________________________________________________ Time complexity- O(n* log(max element)), space complexity- O(1)

public class Solution {
    public static int findMax(int v[]){
        int maxi  = Integer.MIN_VALUE;
        for(int i=0; i<v.length; i++){
            if(v[i]> maxi) maxi = v[i];
        }
        return maxi;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        int maxi = findMax(v);
        int perHr = maxi;
        int start = 1;
        int end = maxi;

        while(start<= end){
            int mid = start + (end-start)/2;
            int sum = 0;

            for(int i=0; i<v.length; i++){
                sum += Math.ceil((double)v[i]/(double)mid);
            }
            if(sum <= h){
                perHr = Math.min(mid,perHr);
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return perHr;
    }
}




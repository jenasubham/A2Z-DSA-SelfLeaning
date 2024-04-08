// _______________________________________________________________ time complexity- O(log(max element-minimum element) * N), space complexity- O(1)
public class Solution {
    public static int max(int[]arr){
        int maxi = Integer.MIN_VALUE;
        for(int i= 0; i< arr.length; i++){
            if(arr[i]> maxi){
                 maxi = arr[i];
            }
        }
        return maxi;
    }

    public static int min(int[]arr){
        int mini = Integer.MAX_VALUE;
        for(int i= 0; i< arr.length; i++){
            if(arr[i]< mini){
                 mini = arr[i];
            }
        }
        return mini;
    }

    public static boolean possible(int arr[], int day, int r, int b){
        int bouquet = 0;
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<= day){
                count++;
            }
            else{
                bouquet +=( count/r);
                count = 0;
            }
        }
        bouquet += (count/r);

        return (bouquet >= b);
    }
    
    public static int roseGarden(int[] arr, int r, int b) {
        if (r*b > arr.length){
            return -1;
        }
        int start = min(arr);
        int end = max(arr);

        while(start<=end){
            int mid = start +(end-start)/2;

            if(possible(arr, mid, r, b)){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        } 
        return start;
    }
}
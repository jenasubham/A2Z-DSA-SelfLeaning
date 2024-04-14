public class Solution {
    public static int max(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> maxi) maxi = arr[i];
        }
        return maxi;
    }
    public static int smallestDivisor(int arr[], int limit) {
        int maxi = max(arr);
        for(int d=1; d<=maxi; d++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                sum += Math.ceil((double)(arr[j])/(double)d);
            }

            if(sum <= limit){
                return d;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int limit = 8;
        int ans  = smallestDivisor(arr, limit);
        System.out.println(ans);
    }
}


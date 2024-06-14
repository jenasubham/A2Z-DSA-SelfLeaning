// // _____________________________________________________________ time complexity- O(N * (sum-max)), space complexity- O(1)
// public class Solution { 
//     static int countSubarray(int[] arr, int maxSum){
//         int partitions = 1;
//         int subarraySum = 0;

//         for(int i=0; i<arr.length; i++){
//             if(subarraySum + arr[i]<= maxSum){
//                 subarraySum +=arr[i];
//             }
//             else{
//                 partitions++;
//                 subarraySum = arr[i];
//             }
//         }
//         return partitions;
//     }

//     public static int largestSubarraySumMinimized(int []arr, int k) {
//         int low = Integer.MIN_VALUE;
//         int high = 0;
//         //find maximum and summation:
//         for(int ele: arr){
//             low = Math.max(low, ele);
//             high+= ele;
//         }

//         for(int maxSum= low; maxSum<=high; maxSum++){
//             if(countSubarray(arr,maxSum)== k){
//                 return maxSum;
//             }
//         }
//         return low;
//     }
// }

// _____________________________________________________________ time complexity- O(N * log(sum-max)), space complexity- O(1)

public class Solution {
    public static int countPartitions(int[] arr, int maxSum){
        int partitions = 1;
        int subarraySum =0;
        for(int i=0; i<arr.length; i++){
            if(subarraySum+ arr[i] <= maxSum){
                //insert element to current subarray
                subarraySum += arr[i];
            }
            else{
                //insert element to next subarray
                partitions++;
                subarraySum = arr[i];
            }
        }
        return partitions;
    }
    public static int largestSubarraySumMinimized(int []arr, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        //find the maximum and summation of the array. 
        for(int ele: arr){
            start = Math.max(start, ele);
            end += ele;
        }
        
        //Apply binary search:
        while(start<= end){
            int mid = start +(end-start)/2;

            int partitions = countPartitions(arr, mid);
            if(partitions> k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}




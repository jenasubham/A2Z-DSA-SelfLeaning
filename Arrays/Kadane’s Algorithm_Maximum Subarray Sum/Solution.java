// Kadane’s Algorithm : Maximum Subarray Sum in an Array
// Brute force Approach- O(N^2)
// ______________________________________________________________


// public class Solution {
	
// 	public static long maxSubarraySum(int[] arr, int n) {
// 		int sum;
// 		int maxSum=0;
// 		for(int i =0; i<n; i++){
// 			sum = 0;
// 			for(int j =i; j<n;j++){
// 				sum +=arr[j];

// 				maxSum = Math.max(maxSum,sum);
// 			}
// 		}

// 		return maxSum;
// 	}

// }

// ____________________________________________________________________

// Optimal Solution - O(N)

// public class Solution {
	
// 	public static long maxSubarraySum(int[] arr, int n) {
// 		long sum =0;
// 		long maxSum= Integer.MIN_VALUE;

// 		for(int i =0; i<n; i++){
// 			sum += arr[i];

// 			if(sum>maxSum){
//                 maxSum=sum;
//             }

//             if(sum<0){
//                  sum=0;
//             }
			
// 		}
        
//         if(maxSum < 0) maxSum = 0; 
// 		return maxSum;
// 	}
// }

// ____________________________________________________________________
// Follow Up Question - Print that maximum subarray -O(N)

public class solution{

    public static long maxSubarraySum(int[] arr, int n) {
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i=0;i<n;i++){

            if(sum == 0){
                start = i;
            }

            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;

                ansStart = start;
                ansEnd = i;
            }

            if(sum <0) {
                sum =0;
                // start = i+1;  I can remove the first if statement by this line.
            }
        }

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

}
}

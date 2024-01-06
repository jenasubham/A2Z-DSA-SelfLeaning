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

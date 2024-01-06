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

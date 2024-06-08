// ___________________________________________________________ time complexity- O((sum of elements−max element)*n), space complexity- O(1)
// public class Solution {

//     static int max(int[] weights){
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0; i<weights.length; i++){
//             maxi = Math.max(maxi, weights[i]);
//         }
//         return maxi;
//     }

//     static int sum(int[] weights){
//         int sum = 0;
//         for(int i=0; i<weights.length; i++){
//             sum += weights[i];
//         }
//         return sum;
//     }

    
//     static int reqDays(int[] weights, int capacity){
//         int days = 1;
//         int load =0;
//         for(int i=0; i<weights.length; i++){
//             if(load+weights[i] > capacity){
//                 days++;
//                 load = weights[i];
//             }
//             else{
//                 load += weights[i];
//             }
//         }
//         return days;
//     }

//     public static int leastWeightCapacity(int[] weights, int d) {
//         int min = max(weights);
//         int  maxi = sum(weights);
//         for(int capacity=min; capacity<=maxi; capacity++){
//             int reqDays = reqDays(weights, capacity);
//             if(reqDays<= d){
//                 return capacity;
//             }
//         }
//         return -1;
//     }
// }


// ___________________________________________________________time complexity- O(log(sum of elements−max element)*n), space complexity- O(1)
public class Solution {

    // finding the maximum element in the array
    static int maxArr(int[] weights){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            maxi = Math.max(maxi, weights[i]);
        }
        return maxi;
    }

    // finding the sum of all the array elements
    static int sumArr(int[] weights){
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
        }
        return sum;
    }

    // finding how much days will required to ship with a particular capacity
    static int requiredDays(int[] weights, int capacity){
        int sum =0;
        int days = 1;
        for(int i=0; i<weights.length; i++){
            if(sum+weights[i]<= capacity){
                sum+= weights[i];
            }
            else{
                sum = weights[i];
                days++;
            }
        }
        return days;
    }
    
    public static int leastWeightCapacity(int[] weights, int d) {
        int minCap = maxArr(weights);
        int maxCap = sumArr(weights);
        int ans = -1;
        while(minCap<= maxCap){
            int mid = minCap+ (maxCap-minCap)/2;

            int daysReq = requiredDays(weights, mid);
            if(daysReq<= d){
                ans = mid;
                maxCap = mid-1;
            }

            else{
                minCap = mid+1;
            }
        }
        return ans;
    }
}
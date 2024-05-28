// ___________________________________________________________ time complexity- O((sum of elements−max element)*n), space complexity- O(1)
public class Solution {

    static int max(int[] weights){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            maxi = Math.max(maxi, weights[i]);
        }
        return maxi;
    }

    static int sum(int[] weights){
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
        }
        return sum;
    }

    
    static int reqDays(int[] weights, int capacity){
        int days = 1;
        int load =0;
        for(int i=0; i<weights.length; i++){
            if(load+weights[i] > capacity){
                days++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int min = max(weights);
        int  maxi = sum(weights);
        for(int capacity=min; capacity<=maxi; capacity++){
            int reqDays = reqDays(weights, capacity);
            if(reqDays<= d){
                return capacity;
            }
        }
        return -1;
    }
}


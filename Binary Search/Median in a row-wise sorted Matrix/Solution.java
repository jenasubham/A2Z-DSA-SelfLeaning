// ___________________________________________________time complexity- O(MXN) + O(MXN(log(MXN))), space complexity- O(MXN)

// import java.util.*;;
// public final class Solution {
//     public static int findMedian(int matrix[][], int n, int m) {
//         List<Integer> lst = new ArrayList<>();

//         // Traverse the matrix and
//         // copy the elements to the list:
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 lst.add(matrix[i][j]);
//             }
//         }
//         // Sort the list:
//         Collections.sort(lst);
//         return lst.get((m * n) / 2);
//     }
// }



// __________________________________________________________________ time complexity- O(log(max) * N * log(M)), space complexity- O(1)

public final class Solution {

    //find how many integers are there in a row which are smaller than an element
    public static int upperbound(int[] arr,int ele, int m){
        int start = 0, end = m-1;
        int ans = m;

        while(start<= end){
            int mid = start+ (end-start)/2;

            if(arr[mid] > ele){
                // look for a smaller index on the left
                ans = mid;
                end = mid-1;
            }
            else{
                // look on the right
                start = mid+1;
            }
        }
        return ans;
    }

    // find how many integers are there in the whole matrix which are smaller than an element
    public static int countSmallEqual(int[][] matrix, int ele, int n, int m){
        int count =0;
        for(int i=0; i<n; i++){
            count += upperbound(matrix[i], ele, m);
        }
        return count;
    }


    public static int findMedian(int matrix[][], int n, int m) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }

        int req = (m*n)/2;

        while(low<= high){
            int mid = low+ (high-low)/2;

            int smallEqual = countSmallEqual(matrix, mid, n, m);

            if(smallEqual <= req){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}
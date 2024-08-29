// ______________________________________________________________________ time complexity- O(logM * N), space complexity- O(1)
public class Solution {
    // To find the maximun element from a particular column
    public static int findMaxEle(int[][]G, int col, int n){
        int maxi = -1, index = -1;

        for(int i=0; i<n; i++){
            if(G[i][col] > maxi){
                maxi = G[i][col];
                index = i;
            }
        }
        return index;
    }


    public static int[] findPeakGrid(int [][]G){
        int n = G.length;
        int m = G[0].length;

        int start = 0;
        int end = m-1;

        while(start<=end){
            int mid = start + (end-start);

            int maxRowIndex = findMaxEle(G, mid, n);
            // the left and right element of the max element in the matrix
            int left = mid-1 >= 0 ? G[maxRowIndex][mid-1] : -1;
            int right = mid+1 <m ? G[maxRowIndex][mid+1] : -1;

            //the left and right element of the max element are smaller(means peak ele)
            if(G[maxRowIndex][mid] > left && G[maxRowIndex][mid] > right){
                return new int[] {maxRowIndex,mid};
            } 
            else if(G[maxRowIndex][mid] < left){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}



// ____________________Same approch but binary search on rows__________________ time complexity- O(logN * M), space complexity- O(1)


// public class Solution {
//     // find the max element from a particular row
//     public static int findMaxEle(int[] arr){
//         int maxi = -1, index = -1;
//         for(int i=0; i< arr.length; i++){
//             if(arr[i]>maxi){
//                 maxi = arr[i];
//                 index = i;
//             }
//         }
//         return index;
//     }

//     public static int[] findPeakGrid(int [][]G){
//         int n = G.length;
//         int m = G[0].length;
//         int start = 0;
//         int end = n-1;
//         while(start <= end){
//             int mid = start + (end-start)/2;
//             int maxColIndex = findMaxEle(G[mid]);

//             // the top and bottom element of the max element in the matrix
//             int top = mid-1 >=0 ? G[mid-1][maxColIndex] : -1;
//             int bottom = mid+1 <n ? G[mid+1][maxColIndex] : -1;

//             // if the mid element is itself peak element
//             if(G[mid][maxColIndex] > top && G[mid][maxColIndex] > bottom){
//                 return new int[] {mid, maxColIndex};
//             }
            
//             else if(G[mid][maxColIndex] < top){
//                 end = mid-1;
//             }
//             else{
//                 start = mid+1;
//             }
//         }
//         return new int[] {-1,-1};
//     }
// }
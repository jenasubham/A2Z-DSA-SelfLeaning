

// ________________Same approch but binary search on rows__________________ time complexity- O(logN * m), space complexity- O(1)
public class Solution {
    // find the max element from a particular row
    public static int findMaxEle(int[] arr){
        int maxi = -1, index = -1;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>maxi){
                maxi = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int [][]G){
        int n = G.length;
        int m = G[0].length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int maxColIndex = findMaxEle(G[mid]);

            // the top and bottom element of the max element in the matrix
            int top = mid-1 >=0 ? G[mid-1][maxColIndex] : -1;
            int bottom = mid+1 <n ? G[mid+1][maxColIndex] : -1;

            // if the mid element is itself peak element
            if(G[mid][maxColIndex] > top && G[mid][maxColIndex] > bottom){
                return new int[] {mid, maxColIndex};
            }
            
            else if(G[mid][maxColIndex] < top){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
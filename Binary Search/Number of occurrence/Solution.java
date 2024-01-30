// ________________________________________________________ time complexity- O(logn), space complexity- O(1)
public class Solution {
    public static int firstOccurrence(int arr[], int n, int k){
        int start = 0;
        int end = n-1;
        int first = -1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==k){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int n, int k){
        int start = 0;
        int end = n-1;
        int last = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==k){
               last = mid;
               start = mid+1; 
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return last;
    }
    public static int count(int arr[], int n, int x) {
        int first = firstOccurrence(arr,n,x);
        if(first == -1) return 0;
        
        int last = lastOccurrence(arr,n,x);

        return (last-first)+1;
    }
}
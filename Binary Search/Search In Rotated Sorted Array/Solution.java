import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        int end = n-1;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(arr.get(mid) == k){
                return mid;
            }
            else if(arr.get(mid)< arr.get(end)){
                //right side is sorted
                if(arr.get(mid)<=k && k<=arr.get(end)){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                //left side is sorted
                if(arr.get(mid)>= k && k>= arr.get(start)){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
        }
        return -1;
    }
}
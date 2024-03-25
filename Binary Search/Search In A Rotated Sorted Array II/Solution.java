public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []arr, int key) {
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start+end)/2;

            if(arr[mid]==key){
                return true;
            }
            //edge case 
            if(arr[mid]== arr[start] && arr[mid]== arr[end]){
                start++;
                end--;
                continue;
            }
            //left sorted
            else if(arr[start]<=arr[mid]){
                if(key>= arr[start] && key<= arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            //right sorted
            else{
                if(key>= arr[mid] && key<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int []arr = {6, 10, 1, 3, 5};
        int key = 9;
        System.out.println(searchInARotatedSortedArrayII(arr, key));
    }
}
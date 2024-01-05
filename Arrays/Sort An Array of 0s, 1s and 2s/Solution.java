import java.util.*;
// ___________________________________________________________
// Better approach

// public class Solution {
//     public static void sortArray(ArrayList<Integer> arr, int n) {       O(2N)
//             int count0 = 0, count1 = 0;

//         for(int i=0; i<n;i++){
//             if(arr.get(i)==0){
//                 count0++;
//             }
//             else if(arr.get(i)==1){
//                 count1++;
//             }

//         }

//         int i = 0;
//         int j = count0;
//         int k = count0+count1;

//         while(i < count0 || j < count0+count1 || k<n){
//             if(i < count0){
//             arr.set(i,0);
//             i++;
//             }

//             else if(j < count0+count1){
//             arr.set(j,1);
//             j++;
//             }

//             else{
//             arr.set(k,2);
//             k++;
//             } 

//         }

//     }    
// }

// ___________________________________________________________
// Optimal approach

public class Solution {


    public static void sortArray(int arr[], int n) {

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
                
            } else if (arr[mid] == 2) {
                // swapping arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            } else {
                mid++;
            }
        }

    }
}
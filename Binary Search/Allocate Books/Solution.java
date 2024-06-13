// ____________________________________________________________ time complexity- O(Sum - max)*O(n), space complexity- O(1)
// import java.util.*;
// public class Solution {
//     // function for finding the maximun element
//     static int max(ArrayList<Integer> arr, int n){
//         int maxi = Integer.MIN_VALUE;
//         for(int e: arr){
//             maxi = Math.max(maxi, e);
//         }
//         return maxi;
//     }

//     // function for finding the sum of all the elements
//     static int sumOfArr(ArrayList<Integer> arr, int n){
//         int sum = 0;
//         for(int e: arr){
//             sum += e;
//         }
//         return sum;
//     }

//     static int countStudents(ArrayList<Integer> arr, int maxPage){
//         int n = arr.size();
//         int students = 1;
//         int pagesToStudent = 0;
//         for(int i=0; i<n; i++){
//             if(pagesToStudent+arr.get(i) <= maxPage){
//                 pagesToStudent += arr.get(i);
//             }
//             else{
//                 students++;
//                 pagesToStudent = arr.get(i);
//             }
            
//         }
//         return students;
//     }

//     public static int findPages(ArrayList<Integer> arr, int n, int m) {
//         //base case
//         if(m>n){
//             return -1;
//         }

//         int maxi = max(arr,n);
//         int sum = sumOfArr(arr, n);

//         for(int pages=maxi; pages<=sum; pages++){
//             int students = countStudents(arr, pages);
//             // all books should be allocated so books allocated students == students
//             if(students == m){
//                 return pages;
//             }
//         }

//         return maxi;
//     }
// }

// ___________________________________________________________ time complexity- O(N * log(sum-max)), space complexity- O(1)
import java.util.*;
public class Solution {

    // function for finding the maximun element
    static int max(ArrayList<Integer> arr, int n){
        int maxi = Integer.MIN_VALUE;
        for(int ele: arr){
            maxi = Math.max(maxi, ele);
        }
        return maxi;
    }

    // function for finding the sum of all the elements
    static int sum(ArrayList<Integer> arr, int n){
        int sum= 0;
        for(int ele: arr){
            sum+= ele;
        }
        return sum;
    }

    static int countStudents(ArrayList<Integer> arr, int pages){
        int n = arr.size();
        int students = 1;
        int pagesStudent = 0;
        for(int i=0; i<n; i++){
            if(pagesStudent+ arr.get(i) <= pages){
                // add pages to current student
                pagesStudent += arr.get(i);
            }
            else{
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // base case
        if(m>n){
            return -1;
        }

        int start = max(arr, n);
        int end = sum(arr, n);

        while(start<= end){
            int mid = start+(end-start)/2;

            int students = countStudents(arr, mid);
            if(students> m){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start; 
    }
}
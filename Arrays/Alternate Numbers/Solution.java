// public class Solution {  TIme- O(2N), Space- O(N) Brute force
//     public static int[] alternateNumbers(int []arr) {
//         int n = arr.length;
//         int pos[] =new int[n/2];
//         int neg[] = new int[n/2];

//         int j = 0;
//         int k = 0;

//         for(int i=0;i<n; i++){
//             if(arr[i] > 0){
//                 pos[j] = arr[i];
//                 j++;
//             }
//             else{
//                 neg[k] = arr[i];
//                 k++;
//             }
//         }

//         for(int i=0;i<n/2;i++){
//             arr[i*2] = pos[i];
//             arr[i*2+1] = neg[i];
//         }
        
//         return arr;
//     }
// }


// __________________________________________________________________________________

// public class Solution {      TIme- O(N), Space- O(N) Optimal
//     public static int[] alternateNumbers(int []arr) {
//         int n = arr.length;
//         int sol[] = new int[n];

//         int pos = 0;
//         int neg = 1;

//         for(int i=0;i<n;i++){
//             if(arr[i] >0){
//                 sol[pos]  = arr[i];
//                 pos +=2;
//             }
//             else{
//                 sol[neg] = arr[i];
//                 neg +=2;
//             }
//         }
//         return sol;
//     }
// }
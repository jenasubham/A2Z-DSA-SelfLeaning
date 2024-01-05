// Brute Solution

// public class Solution {
//     public static int majorityElement(int []v) {
//         for(int i=0; i<v.length;i++){
//             int count = 0;
//             for(int j=0; j<v.length;j++){
//                 if(v[i]==v[j]){
//                     count++;
//                 }
//             }
//             if(count > v.length/2){
//                 return v[i];
//             }
//         }
//         return -1;
//     }
// }


// _____________________________________________________________
// Optimal Solution

public class Solution {
    public static int majorityElement(int []arr) {
        int n = arr.length;
        int count = 0;
        int element=arr[0];

        for(int i=0; i<n;i++){
            // pick a element when the count will become 0.
            if(count ==0){
                element = arr[i];
            }

            if(arr[i]==element){
                count++;
            }
            else{
                count--;
            }
        }

        // the element will be answer.
        // but if there is a confusion if there may be any majority elemnt or not, then the below for loop for the checking purpose.
        //  So if the problem statement is there may or may not have a maj element then the complexity will be O(2N), bcz of below loop. 

        count = 0;
        for(int i=0; i<n;i++){
            if(arr[i] == element){
                count++;
            }
        }

        if(count > n/2){
            return element;
        }
        return -1;
    }
}
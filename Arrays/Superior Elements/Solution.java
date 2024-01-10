// ________________________________________________________________ Time- O(N^2), No extra-space but for returning O(N) 
// import java.util.*;
// public class Solution {
//     public static List< Integer > superiorElements(int []a) {
//         int n = a.length;
//         List<Integer> ans = new ArrayList<>(); 
        
//         for(int i=0; i<n; i++){
//             boolean flag = true;
//             for(int j=i+1; j<n;j++){
//                 if(a[i] < a[j]){
//                     flag = false;
//                     break;
//                 }
//             }
//             if(flag==true && !ans.contains(a[i])){  
//                 ans.add(a[i]);
//             }
//         }
        
//         Collections.sort(ans);

//         return ans;
//     }

// }


// __________________________________________________________________________ Time- O(N), No extra-space but for returning O(N) 
import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        List< Integer > ans = new ArrayList<>();

        for(int i=n-1; i>=0; i--){
            if(a[i] > max){
                ans.add(a[i]);
                max = a[i];
            }
        }
        return ans;
    }
}
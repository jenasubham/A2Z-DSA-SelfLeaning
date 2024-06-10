// ____________________________________________________________ time complexity- O(max-min)*O(n), space complexity- O(1)
import java.util.*;
public class Solution {

    static boolean canPlace(int[] stalls, int minDis, int cows){
        int cowPlaced = 1; 
        int last = stalls[0];

        for(int j=1; j<stalls.length; j++){
            int dis = stalls[j]- last;
            if(dis>= minDis){
                cowPlaced++;
                last = stalls[j];
            }
            if(cowPlaced >= cows) return true;
        }

        return false;

    }
    public static int aggressiveCows(int []stalls, int k) {
        int n = stalls.length;

        Arrays.sort(stalls);
        
        
        int limit = stalls[n-1] - stalls[0];
        for(int i=1; i<= limit; i++){
            if(canPlace(stalls, i, k) == false){
                return (i-1);
            }
            
        }

        return limit;

    }
}
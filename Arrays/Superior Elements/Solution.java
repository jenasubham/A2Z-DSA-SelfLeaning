// __________________________________________________________________________
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
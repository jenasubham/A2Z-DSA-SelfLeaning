public class Solution {
    public static int Power(int i, int n){
        return (int)Math.pow(i,n);
    }

    public static int NthRoot(int n, int m) {
        int start = 1;
        int end = m;

        while(start<= end){
            int mid = start + (end-start)/2;

            int ans = Power(mid, n);
            if( ans == m){
                return mid;
            }
            else if(ans > m){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}


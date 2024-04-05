public class Solution {
    public static int findMax(int v[]){
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<v.length; i++){
            if(v[i]> maxi) maxi = v[i];
        }
        return maxi;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        int maxi = findMax(v);
        for(int i=1; i<=maxi; i++){
            int sum = 0;

            for(int j=0;j<v.length; j++){
                int temp = (int)Math.ceil((double)v[j] / i);
                sum +=temp;
            }
            if(sum<= h){
                return i;
            }
        }
        return maxi;
    }
}




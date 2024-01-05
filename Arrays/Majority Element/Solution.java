public class Solution {
    public static int majorityElement(int []v) {
        for(int i=0; i<v.length;i++){
            int count = 0;
            for(int j=0; j<v.length;j++){
                if(v[i]==v[j]){
                    count++;
                }
            }
            if(count > v.length/2){
                return v[i];
            }
        }
        return -1;
    }
}
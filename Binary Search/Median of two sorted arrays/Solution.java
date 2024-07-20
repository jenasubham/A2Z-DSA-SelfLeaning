// ______________________________________________________________ Time complexity- O(n), space complexity- O(n)
public class Solution {
    public static double median(int[] a, int[] b) {
        double ans = 0;
        int length1 = a.length;
        int length2 = b.length;
        int length = length1+length2;
        int arr[] = new int[length];

        int ptr1 = 0;
        int ptr2 = 0;
        int ptr3 = 0;

        while(ptr1<length1 && ptr2<length2){
            if(a[ptr1]<= b[ptr2]){
                arr[ptr3] = a[ptr1];
                ptr1++;
            }
            else {
                arr[ptr3] = b[ptr2];
                ptr2++;
            }
            ptr3++;
        }

        while(ptr1<length1){
            arr[ptr3] = a[ptr1];
            ptr1++;
            ptr3++;
        }
        while(ptr2<length2){
            arr[ptr3] = b[ptr2];
            ptr2++;
            ptr3++;
        }

        if(length % 2==0){
            ans = (double)(arr[length/2] + arr[length/2-1])/2;
        }
        else{
            ans = arr[length/2];
        }
        return ans;
    }
}
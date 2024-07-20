// ______________________________________________________________ Time complexity- O(n), space complexity- O(n)
// public class Solution {
//     public static double median(int[] a, int[] b) {
//         double ans = 0;
//         int length1 = a.length;
//         int length2 = b.length;
//         int length = length1+length2;
//         int arr[] = new int[length];

//         int ptr1 = 0;
//         int ptr2 = 0;
//         int ptr3 = 0;

//         while(ptr1<length1 && ptr2<length2){
//             if(a[ptr1]<= b[ptr2]){
//                 arr[ptr3] = a[ptr1];
//                 ptr1++;
//             }
//             else {
//                 arr[ptr3] = b[ptr2];
//                 ptr2++;
//             }
//             ptr3++;
//         }

//         while(ptr1<length1){
//             arr[ptr3] = a[ptr1];
//             ptr1++;
//             ptr3++;
//         }
//         while(ptr2<length2){
//             arr[ptr3] = b[ptr2];
//             ptr2++;
//             ptr3++;
//         }

//         if(length % 2==0){
//             ans = (double)(arr[length/2] + arr[length/2-1])/2;
//         }
//         else{
//             ans = arr[length/2];
//         }
//         return ans;
//     }
// }


// ______________________________________________________________ Time complexity- O(n), space complexity- O(1)
public class Solution {
    public static double median(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;

    	int ptr1 = 0;
        int ptr2 = 0;
        int curIndex = 0;
        int n = (n1+n2);
        int index2 = n/2;;
        int index1 = index2-1;;
        int ele1 = -1;
        int ele2 = -1;

        while(ptr1<n1 && ptr2<n2){
            if(a[ptr1] <= b[ptr2]){
                if(curIndex==index1) ele1 = a[ptr1];
                if(curIndex == index2) ele2 = a[ptr1];
                ptr1++;
            }
            else{
                if(curIndex == index1) ele1 = b[ptr2];
                if(curIndex == index2) ele2 = b[ptr2];
                ptr2++;
            }
            curIndex++;
        }

        while(ptr1<n1){
            if(curIndex == index1) ele1 = a[ptr1];
            if(curIndex == index2) ele2 = a[ptr1];
            ptr1++;
            curIndex++;
        }
        while(ptr2<n2){
            if(curIndex == index1) ele1 = b[ptr2];
            if(curIndex == index2) ele2 = b[ptr2];
            ptr2++;
            curIndex++;
        }

        if(n %2 ==1){
            return ele2;
        }
        return (double)(ele1+ele2)/2;
    }
}
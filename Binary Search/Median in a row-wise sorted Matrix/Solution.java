// ___________________________________________________time complexity- O(MXN) + O(MXN(log(MXN))), space complexity- O(MXN)
import java.util.*;;
public final class Solution {
    public static int findMedian(int matrix[][], int n, int m) {
        List<Integer> lst = new ArrayList<>();

        // Traverse the matrix and
        // copy the elements to the list:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lst.add(matrix[i][j]);
            }
        }

        // Sort the list:
        Collections.sort(lst);
        return lst.get((m * n) / 2);
    }
}
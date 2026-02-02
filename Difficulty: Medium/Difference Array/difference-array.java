import java.util.*;

class Solution {
    public static ArrayList<Integer> diffArray(int[] arr, int[][] opr) {
        int n = arr.length;
        int[] diff = new int[n];

        // Apply all operations
        for (int i = 0; i < opr.length; i++) {
            int l = opr[i][0];
            int r = opr[i][1];
            int v = opr[i][2];

            diff[l] += v;
            if (r + 1 < n)
                diff[r + 1] -= v;
        }

        // Build final array using prefix sum
        ArrayList<Integer> res = new ArrayList<>();
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            res.add(arr[i] + curr);
        }

        return res;
    }
}

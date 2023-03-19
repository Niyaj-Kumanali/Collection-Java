package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class RowColumnSum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(Arrays.toString(solve(a)));
    }

    public static int[] solve(int[][] A) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++){
            int sum = 0;
            for (int j=0; j < A[0].length; j++){
                sum  += A[i][j];
            }
            list.add(sum);
        }
        for (int i = 0; i < A.length; i++){
            int sum = 0;
            for (int j=0; j < A[0].length; j++){
                sum  += A[j][i];
            }
            list.add(sum);
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

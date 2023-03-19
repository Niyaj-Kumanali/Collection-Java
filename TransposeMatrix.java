package Collection;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] A = solve(a);
        for (int i = 0; i < A.length; i++){
            for (int j=0; j < A[0].length; j++){
                System.out.print(A[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] A) {
        int[][] ans = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++){
            for (int j=0; j < A[0].length; j++){
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
}

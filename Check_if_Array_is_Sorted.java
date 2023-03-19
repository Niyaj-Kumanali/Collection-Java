package Collection;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {
        if (A.length == 1)
            return 1;
        if (A[0] > A[A.length-1])
            return 0;
        Boolean isSorted = true;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i+1])
                isSorted = false;
        }
        if (isSorted)
            return 1;
        return 0;
    }
}

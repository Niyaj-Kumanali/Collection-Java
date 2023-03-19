package Collection;

public class Time_To_End_Corona {
    public static void main(String[] args) {
        System.out.println(solve(25,16,2));
    }

    public static int solve(int A, int B, int C) {
        int total = B + C;
        int remCases = total - A;
        if (remCases > 0)
            return remCases;
        return 0;
    }
}

package Collection;

public class FibonacciSeries {
    public static void main(String[] args) {
        int range = 100;
        fibUpto(range);
        System.out.println();

        fibFrom(range,0,1);
        System.out.println();

        System.out.println(fibNumAt(99));

        System.out.println(fibAt(49));


    }
    public static void fibUpto(int n)
    {
        int a = 0;
        int b = 1;
        int next = a + b;
        System.out.print(a + " ");
        fibFrom(n, b, next);
    }

    public static void fibFrom(int n, int a, int b) {
        if (a > n)
            return;
        System.out.print(a + " ");
        fibFrom(n, b, a+b);
    }

    public static long fibAt(int n)
    {
        if (n>1 && n <= 3)
            return 1;
        if (n <= 1)
            return 0;
        return fibAt(n-2) + fibAt(n - 1);
    }

    public static long fibNumAt(int n)
    {
        long a = 0;
        long b = 1;
        if (n == 2)
            return b;
        if (n <= 1)
            return a;
        for (int i = 3; i <= n; i++)
        {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}

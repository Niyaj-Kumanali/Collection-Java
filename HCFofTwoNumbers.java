package Collection;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(calcHCM(a, b));
    }

    public static int calcHCM(int a, int b)
    {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int fact = min;
        while(true)
        {
            if(min%fact==0 && max%fact==0)
                return fact;
            fact--;
        }
    }
}

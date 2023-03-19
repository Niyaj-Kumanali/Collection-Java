package Collection;

public class Difference_of_even_and_odd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(even_odd(arr));
    }

    public static int even_odd(int[] ls) {
        int even = 0;
        int odd = 0;
        for (int i : ls){
            if (i % 2 == 0)
                even += i;
            else
                odd += i;
        }
        return even - odd;
    }
}

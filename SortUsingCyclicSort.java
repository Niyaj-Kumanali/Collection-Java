package Collection;

import java.util.Arrays;

public class SortUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[] arr)
    {
        int i = 0;

        while(i < arr.length - 1) {
            //It is for range 1 to n but for 0 to n remove -1 from below
            int correct = arr[i] -1;
            if (arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

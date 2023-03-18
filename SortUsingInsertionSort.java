package Collection;

import java.util.Arrays;

public class SortUsingInsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[] arr) {
        for ( int i=0; i<arr.length -1; i++)
            for ( int j = i+1; j>0; j--)
                if (arr[j] < arr[j-1] )
                    swap(arr, j, j-1);
        return arr;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

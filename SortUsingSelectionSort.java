package Collection;

import java.util.Arrays;

public class SortUsingSelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] arr) {
        for (int i=0; i<arr.length - 1; i++)
        {
            int maxIndex = indexOfMax(arr,arr.length - i);
            if (!(maxIndex == arr.length - i - 1))
                swap(arr, maxIndex, arr.length-i-1);
        }
        return arr;
    }

    public static int indexOfMax(int[] arr, int end)
    {
        int maxIndex = 0;
        for (int i=0; i < end; i++)
            if (arr[i] > arr[maxIndex])
                maxIndex = i;

        return maxIndex;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

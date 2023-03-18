package Collection;

import java.util.Arrays;

public class SortUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            boolean sorted = false;
            for (int j = 1; j <= arr.length - i -1; j++)
                if (arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                    sorted = true;
                }
            if (!sorted)
                break;
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

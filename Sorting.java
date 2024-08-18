package Collection;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,3,6,4,5};

        System.out.println(Arrays.toString(bubbleSort(arr1)));
        System.out.println(Arrays.toString(selectionSort(arr2)));
        System.out.println(Arrays.toString(insertionSort(arr3)));
        System.out.println(Arrays.toString(cyclicSort(arr4)));
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

    public static int[] selectionSort(int[] arr) {
        for (int i=0; i<arr.length - 1; i++)
        {
            int maxIndex = indexOfMax(arr,arr.length - i);
            if (!(maxIndex == arr.length - i - 1))
                swap(arr, maxIndex, arr.length-i-1);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for ( int i=0; i<arr.length -1; i++)
            for ( int j = i+1; j>0; j--)
                if (arr[j] < arr[j-1] )
                    swap(arr, j, j-1);
        return arr;
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

    public static int indexOfMax(int[] arr, int end)
    {
        int maxIndex = 0;
        for (int i=0; i < end; i++)
            if (arr[i] > arr[maxIndex])
                maxIndex = i;

        return maxIndex;
    }
}

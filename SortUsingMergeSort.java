package Collection;

import java.util.Arrays;

public class
SortUsingMergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
//    merge sort in place
    public static void mergeSort(int[] arr, int start, int end){
        if (end -start  == 1)
            return;

        int mid = start + (end - start)/2;

        mergeSort(arr, start , mid);
        mergeSort(arr, mid , end);

        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++)
            arr[start+l] = mix[l];
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length == 1)
            return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}

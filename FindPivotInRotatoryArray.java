package Collection;

public class FindPivotInRotatoryArray {
    public static void main(String[] args)
    {
        int[] arr= { 4 ,5, 1};
        System.out.println(findPivot(arr));
    }

    public static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        if (end == 0 || arr[start] < arr[end])
            return end;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[end])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}

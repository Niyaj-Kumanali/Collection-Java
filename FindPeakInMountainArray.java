package Collection;

public class FindPeakInMountainArray {
    public static void main(String[] args)
    {
        int[] arr = {2,3,2,1};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end -start)/2;
            if (start == end)
                return start;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return -1;
    }
}

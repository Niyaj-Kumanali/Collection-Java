package Collection;

public class BinarySearch {
    public static void main(String[] args)
    {

        int[] arr1 = {2,3,4,5,6,7,8,9,10};
        int target1 = 6;
//        System.out.println(binarySearchForAscending(arr1, target1));

        int[] arr2 = {5,4,3,2,1,0};
        int target2 = 5;
//        System.out.println(binarySearchForDescending(arr2, target2));

        System.out.println(binarySearch(arr1, target1,0,arr1.length-1));
        System.out.println(binarySearch(arr2, target2,0,arr2.length-1));

    }

    static int binarySearchForAscending(int[] arr, int target)
    {
        int s = 0;
        int e = arr.length -1;
        while (s <= e)
        {
            //mid = (s + e)/2 both are similar
            int mid = s + (e - s)/2;

            //if we found target on left side then there is no need to search at right
            if (target < arr[mid]) {
                e = mid - 1;
            }
            //if we found target on right side then there is no need to search at left
            else if (target > arr[mid]) {
                s = mid + 1;
            }
            //if it not found on either side then it is mid only
            else
                return mid;
        }
        //return -1 if not found
        return -1;
    }

    static int binarySearchForDescending(int[] arr, int target)
    {
        int s = 0;
        int e = arr.length -1;
        while (s <= e)
        {
            //mid = (start + end)/2 both are similar
            int mid = s + (e - s)/2;

            //if we found target on left side then there is no need to search at right
            if (target > arr[mid]) {
                e = mid - 1;
            }
            //if we found target on right side then there is no need to search at left
            else if (target < arr[mid]) {
                s = mid + 1;
            }
            //if it not found on either side then it is mid only
            else
                return mid;
        }
        //return -1 if not found
        return -1;
    }

    static int binarySearch( int[] arr, int target )
    {
        int s = 0;
        int e = arr.length -1;
        boolean isAsc = arr[s] < arr[e];

        while (s <= e)
        {
            //mid = (start + end)/2 both are similar but
            // int has some range to not overbound that size we have used this
            int mid = s + (e - s)/2;

            //return mid if mid is target
            if (arr[mid] == target)
                return mid;

            if(isAsc)
            {
                //if we found target on left side then there is no need to search at right
                if (target < arr[mid])
                    e = mid - 1;
                //if we found target on right side then there is no need to search at left
                else
                    s = mid + 1;
            }
            else
            {
                //if we found target on left side then there is no need to search at right
                if (target > arr[mid])
                    e = mid - 1;
                //if we found target on right side then there is no need to search at left
                else
                    s = mid + 1;
            }

        }
        //return -1 if not found
        return -1;
    }
//    without ternary operator and with recursion
//    public static int binarySearch(int[] arr, int target, int s, int e)
//    {
//        if (s < e)
//        {
//            boolean isAsc = arr[s] < arr[e];
//            int mid = s + (e - s)/2;
//
//            if (arr[mid] == target)
//                return mid;
//            if (isAsc)
//            {
//                if (arr[mid] < target)
//                    return binarySearch(arr, target, mid + 1, e);
//                else
//                    return binarySearch(arr, target, s, mid - 1);
//            }
//            else
//            {
//                if (arr[mid] < target)
//                    return binarySearch(arr, target, s, mid - 1);
//                else
//                    return binarySearch(arr, target, mid + 1, e);
//            }
//        }
//        return -1;
//    }


    //    with ternary operator and with recursion
    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        if (start < end)
        {
            boolean isAsc = arr[start] < arr[end];
            int mid = start + (end - start)/2;
            if (arr[mid] == target)
                return mid;
            if (isAsc)
                return arr[mid] < target ? binarySearch(arr, target, mid + 1, end) : binarySearch(arr, target, start, mid - 1);
            else
                return arr[mid] < target? binarySearch(arr, target, start, mid - 1) : binarySearch(arr, target, mid + 1, end);
        }
        return -1;
    }
}

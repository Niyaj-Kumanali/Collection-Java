package Collection;

public class BinarySearchForBothUsingRecursion {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7,8,9,10};
        int target1 = 6;

        int[] arr2 = {5,4,3,2,1,0};
        int target2 = 5;

        System.out.println(binarySearch(arr1, target1,0,arr1.length-1));
        System.out.println(binarySearch(arr2, target2,0,arr2.length-1));
    }
        //    with ternary operator and with recursion
    public static int binarySearch(int[] arr, int target, int s, int e)
    {
        if (s < e)
        {
            boolean isAsc = arr[s] < arr[e];
            int mid = s + (e - s)/2;
            if (arr[mid] == target)
                return mid;
            if (isAsc)
                return arr[mid] < target ? binarySearch(arr, target, mid + 1, e) : binarySearch(arr, target, s, mid - 1);
            else
                return arr[mid] < target? binarySearch(arr, target, s, mid - 1) : binarySearch(arr, target, mid + 1, e);
        }
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
}

package Collection;

public class BinarySearchForBoth {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7,8,9,10};
        int target1 = 6;

        int[] arr2 = {5,4,3,2,1,0};
        int target2 = 5;

        System.out.println(binarySearch(arr1, target1));
        System.out.println(binarySearch(arr2, target2));
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
}

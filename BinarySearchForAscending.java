package Collection;

public class BinarySearchForAscending {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        int target = 6;
        System.out.println(binarySearchForAscending(arr, target));
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
}

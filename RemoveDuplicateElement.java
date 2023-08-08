package Collection;

import java.util.Scanner;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the element:");
            array[i] = sc.nextInt();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//            for (int j = (i + 1); j < n; j++) {
//                if (array[i] == array[j]) {
//                    n = n - 1;
//                    array[j] = 0;
//                    for (int k = j; k < n; k++) {
//                        if ((k + 1) < n) {
//                            array[k] = array[k + 1];
//                        } else {
//                            n = n - 1;
//                        }
//                    }
//
//                }
//            }
//        }
        int[] newArray = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                newArray[count] = array[i];
                count++;
            }
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}

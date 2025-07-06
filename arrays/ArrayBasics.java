package arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // Declaration
        int[] arr; 

        /*
         * or int arr[];
         * this is an array variable; no actual array exists;
         * it tells the compiler that this variable will hold array of integer type;
         * reference is created;
        */

        // Initialization
        arr = new int[5];
        arr[0] = 30;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 20;

        /*
         * 1D array;
         * varName = new dataType[size];
         * elements in array allocated by 'new'
         * elements automatically initialized as '0' for int, 'false' for boolean, 'null' for reference types
         * using array literals, if elements are pre-known:
         * int[] arr = new int[]{1, 2, 3, 4, 5};
        */

        int[] arrLiterals = new int[]{1, 2, 3, 4, 5};
        System.out.println(arrLiterals[0]);

        // Traversal
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2D Array Declaration and Initialization --------------------------------------------------------------
        int[][] twoDimArr = new int[2][2];

        for(int i=0; i<twoDimArr.length; i++) {
            System.out.println("row " + (i+1) + ": ");
            for(int j=0; j<twoDimArr.length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }

        // OPERATIONS --------------------------------------------------------------------------------------------

        // Sorting
        Arrays.sort(arr);
        System.out.println(arr); // prints reference value

        /*
         * arr is primitive array of int
         * System.out.println() does NOT override 'toString()' for primitive arrays
         * instead it calls 'Object.toString()' which prints 'className@hashCode'
         * [I@6e0be858 
         * '[I' means array of int
         * '@6e0be858' memory hash code in hex
         * 
         * System.out.println(Arrays.toString(arr));
         * System.out.println(Arrays.deepToString(arr)); // for multi-dimensional arrays
        */

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Copy
        int[] copy = Arrays.copyOf(arr, arr.length);
        
        // Fill
        Arrays.fill(arr, 1);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=0; i<copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        // Arrays.binarySearch(arr, key);        
    }
}
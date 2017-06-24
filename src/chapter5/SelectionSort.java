package chapter5;

/**
 * Created by Harry on 23.06.2017.
 * Selection sort
 */

public class SelectionSort {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int min;
        int size;
        int t;

        size = 10; //number of elements to sort

        //display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);

        System.out.println();

        min = nums[0];
        for (int d = 0; d < 10; d++) {
            for (int b = 9; b >= d; b--) {
                if (nums[b] < nums[d]) {
                    t = nums[d];
                    nums[d] = nums[b];
                    nums[b] = t;
                }
            }

        }
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
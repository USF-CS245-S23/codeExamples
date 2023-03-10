package sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class CountingAndBinSortExercises {
    /**
     * @param arr input array
     * Assume the range of elements  in the array is from 0 to maxValue
     * @param maxValue the largest value that we can have in the array
     * Note: this is not how the counting sort is typically implemented!
     */
    public static void basicCountingSort(int[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        // Iterate over arr, and for each val = arr[i], increment counterArray[val].
        // FILL IN CODE


        // Iterate over the counter array, and use it to sort arr
        // FILL IN CODE
        int count = 0;
        for (int k = 0; k < counterArray.length; k++) {
            // write a loop that adds k to arr num=counterArray[k] times
            // FILL IN CODE
        }
    }

    /**
     * Bin sort
     * @param arr array of elements, where each element has an integer key >= 0
     * @param maxValue largest value of any key in the array
     */
    public static void binSort(Elem[] arr, int maxValue) {
        int i = 0;
        LinkedList<Elem>[] bins = new LinkedList[maxValue+1];
        // Initialize all the linked lists
        for (i = 0; i <= maxValue; i++)
            bins[i] = new LinkedList<>();

        // Iterate over arr; get the key of each element
        // and place the element in the corresponding bin:
        // the index of the bin is equal to the key
        for (i = 0; i < arr.length; i++) {
            // FILL IN CODE

        }

        // Iterate over the bins and place elements back into arr
        int count  = 0;
        for (int k = 0; k <= maxValue; k++) {
            LinkedList<Elem> list  = bins[k];
            // FILL IN CODE: iterate over this bin and place elements back into arr

        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 9, 0, 1, 9, 6, 4};
        basicCountingSort(arr, 10);
        System.out.println(Arrays.toString(arr));

        /*
        // Uncomment for testing the bin sort
        Elem[] elements = {

                new Elem(4, "A"), new Elem(0, "B"),
                new Elem(2, "C"), new Elem(4, "D"),
                new Elem(0, "E"), new Elem(1, "F")
        };
        binSort(elements, 10);
        System.out.println(Arrays.toString(elements));
        */
    }

}

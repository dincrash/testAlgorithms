package Algorithms.Sorting;

import java.util.Arrays;

public class insertionSort {
    public insertionSort(int array[]) {

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}

package Algorithms.Sorting;

import java.util.Arrays;

//Bubble sort

public class bubbleSort {


    // суть алгоритма сначала 1 число проверяется со всеми и как бы сдвигается вправо
    // потом второе число проверяется справа со всеми и так же сдвигается вправо
    public bubbleSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

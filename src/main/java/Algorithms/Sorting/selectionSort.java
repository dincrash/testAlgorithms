package Algorithms.Sorting;

import java.util.Arrays;

public class selectionSort {
    public selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++)
        //поиск наименьшего числа и замена
        {

            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index

                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(arr));
    }
}

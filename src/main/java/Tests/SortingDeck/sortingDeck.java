package Tests.SortingDeck;

import java.util.Arrays;

/*
 * Есть колода от 1 до 100
 * решили отсортировать все карты берет
 * верхнюю если оно минимальное убирает, если нет кладет вниз.
 *
 * Необходимо сосчитать колич раз которое
 * посмотрят верхн карту колоды
 *
 * Пример
 * 4
 * 100 50 60 30
 *
 * Ответ 8
 *
 * */
public class sortingDeck {

    public sortingDeck() {

        /*Сканирование с консоли
        1. сколько чисел
        2.эти числа
        * */

        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        */
        /*Без сканирования. Without Scan*/
        int arr[] = {100, 50, 60, 30};
        int[] iterArr = new int[arr.length];
        System.arraycopy(arr, 0, iterArr, 0, iterArr.length);
        Arrays.sort(iterArr);
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < iterArr.length) {
            if (iterArr[i] <= arr[j]) {
                count++;
                if (iterArr[i] == arr[j]) {
                    i++;
                }
            }
            if (j == iterArr.length - 1) {
                j = 0;
            } else {
                j++;
            }
        }
        System.out.println(count);

    }
}

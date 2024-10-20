package ua.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Ділимо масив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишіть тут ваш код
        if (array.length % 2 == 0) {
            int[] h1 = Arrays.copyOfRange(array, 0, array.length / 2);
            result[0] = h1;
            int[] h2 = Arrays.copyOfRange(array, array.length / 2 , array.length);
            result[1] = h2;
        } else {

            int[] h1 = Arrays.copyOfRange(array, 0, array.length / 2+1);
            result[0] = h1;
            int[] h2 = Arrays.copyOfRange(array, array.length / 2 +1, array.length);
            result[1] = h2;
        }
        System.out.println(Arrays.deepToString(result));
    }


}


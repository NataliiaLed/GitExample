package ua.javarush.task.jdk13.task06.task0625;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальна сума
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }

        int[] sumRow = new int[3];
        for (int a = 0; a < array.length; a++) {
            int sum = 0;
            for (int b = 0; b < array[a].length; b++) {
                sum = sum + array[a][b];
            }
            sumRow[a] = sum;
        }

        int[] sumCol = new int[3];
        for (int c = 0; c < array.length; c++) {
            int sum1 = 0;
            for (int d = 0; d < array[c].length; d++) {
                sum1 += array[d][c];
            }
            sumCol[c] = sum1;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < sumRow.length; i++) {
            if (sumRow[i] < min) {
                min = sumRow[i];
            }
        }
        for (int i = 0; i < sumCol.length; i++) {
            if (sumCol[i] < min) {
                min = sumCol[i];
            }
        }
        System.out.println(min);
    }
}


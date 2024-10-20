package ua.javarush.task.jdk13.task06.task0623;

/* 
Знайомство з двовимірним масивом
*/

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static int[][] array;//напишіть тут ваш код
    // change 2
    public static void main(String[] args) {
        //напишіть тут ваш код

        array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = 1;
                System.out.println(array[i][j]);
            }
        }

    }
}
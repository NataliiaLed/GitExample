package ua.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальний елемент
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);


        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println(max);
    }
}

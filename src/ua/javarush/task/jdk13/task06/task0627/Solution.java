package ua.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Оце так переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i< array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[j][i] = scanner.nextInt();


              }

        }
        System.out.print(array[0][0]+" "+ array[0][1]+ " " + array[0][2]);
        System.out.println();
        System.out.print(array[1][0]+" "+ array[1][1]+ " " + array[1][2]);
        System.out.println();
        System.out.print(array[2][0]+" "+ array[2][1]+ " " + array[2][2]);
    }
}

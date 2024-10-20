package ua.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Піраміда
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner= new Scanner(System.in);
       int input = scanner.nextInt();
        array= new char[input][1 + 2*(input - 1)];

        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[i].length;j++){

                    array[i][j] = '#';

                    System.out.print(array[0][j]);
            }
            System.out.println();
        }
    }
}

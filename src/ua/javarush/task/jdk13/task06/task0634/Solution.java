package ua.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахівниця
*/

public class Solution {
    public static char[][] array;
    public static void main(String[] args) {
        //напишіть тут ваш код

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              if (i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
                  array[i][j] = '#';
              }
              else {
                  array[i][j]= ' ';
              }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

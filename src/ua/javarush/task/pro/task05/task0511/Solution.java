package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray= new int[N][];
        for (int i=0; i < multiArray.length; i++){
            int newNum= scanner.nextInt();
            multiArray[i]= new int[newNum];

        }

    }
}

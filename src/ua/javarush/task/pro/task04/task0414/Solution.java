package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();
        int i =0;

        do {
            System.out.println(line);
            i++;

        }
        while(i<number && number < 5);













    }
}
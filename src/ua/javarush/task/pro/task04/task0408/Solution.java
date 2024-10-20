package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
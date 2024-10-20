package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        int max = 0;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}
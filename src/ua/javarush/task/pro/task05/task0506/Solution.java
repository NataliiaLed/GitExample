package ua.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int current = scanner.nextInt();
            array[i] = current;
            min = Math.min(min, current);
        }
        System.out.println(min);
    }
}


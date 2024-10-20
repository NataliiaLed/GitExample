package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 < side2 + side3
                && side2 < side1 + side3
                && side3 < side1 + side2) {
            System.out.println("трикутник існує");
        } else {
            System.out.println("трикутник не існує");
        }
    }
}

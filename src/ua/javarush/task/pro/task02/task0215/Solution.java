package ua.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Читання чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
Scanner console = new Scanner(System.in);
int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        int sum = (num1+num2+num3)/3;
        System.out.print(sum);
    }
}

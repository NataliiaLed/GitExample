package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);

        while (true) {
            String line = console.nextLine();

            if (line.equals("enough")){
            break;
            }
            System.out.println(line);


        }
    }
}
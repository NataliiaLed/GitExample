package ua.javarush.task.pro.task03.task0312;

import java.util.Locale;
import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = line1.toLowerCase();
        String line4 =line2.toLowerCase();
        if(line3.equals(line4)){
            System.out.println("рядки однакові");
        }
        else{
            //напишіть тут ваш код
            System.out.println("рядки різні");
        }
    }
}

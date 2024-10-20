package ua.javarush.task.pro.task03.task0314;

import java.util.Locale;
import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (secret.equalsIgnoreCase(password)) {

            System.out.println("доступ дозволено");
        } else {
            //напишіть тут ваш код
            System.out.println("доступ заборонено");
        }
    }
}

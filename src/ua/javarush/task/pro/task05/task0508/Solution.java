package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings=new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            if(current == null) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (current.equals(strings[j])) {
                    count++;
                }
            }
            if (count != 1) {
                for (int j = 0; j < strings.length; j++) {
                    if (current.equals(strings[j])) {
                        strings[j] = null;
                    }
                }
            }

        }




        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

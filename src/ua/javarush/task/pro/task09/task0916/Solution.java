package ua.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати %s. Я зароблятиму $%d на місяць.";
        //напишіть тут ваш код
        String result = String.format(phrase, name, salary);

        return result;
    }
}

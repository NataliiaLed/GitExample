package ua.javarush.task.pro.task04.task0403;

import java.text.ParseException;
import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
   public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("ENTER")) {
                break;
            } else {
                int num = Integer.parseInt(input);
                result += num;
            }
        }


        System.out.println(result);
    }

}



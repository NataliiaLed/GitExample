package ua.javarush.task.pro.task03.task0301;

import javax.swing.*;
import java.util.Scanner;

/* 
Тепло чи холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        //напишіть тут ваш код
        Scanner termometro = new Scanner(System.in);
        int temp1 = termometro.nextInt();

        if (temp1 < 0)
            System.out.println("на вулиці холодно");
            else
            System.out.println("на вулиці тепло");

    }
}

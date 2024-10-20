package ua.javarush.task.jdk13.task06.task0637;

import java.io.IOException;
import java.util.Arrays;

/* 
Прямокутник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        array[0]= new char[6];
        array[1]= new char[6];
        array[2]= new char[6];
        array[3]= new char[6];
        array[4]= new char[6];

        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[1], 1, 5,' ');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[2], 1, 5,' ');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[3], 1, 5,' ');
        Arrays.fill(array[4], 'X');

        System.out.print(array[0]);
        System.out.println();
        System.out.print(array[1]);
        System.out.println();
        System.out.print(array[2]);
        System.out.println();
        System.out.print(array[3]);
        System.out.println();
        System.out.print(array[4]);
        System.out.println();

        }
    }


package ua.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатні чверті
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ( x > 0 && y > 0){
            System.out.print(1);
        }
        if ( x<0 && y>0){
            System.out.print(2);
        }
        if ( x<0 && y<0){
            System.out.print(3);
        }
        if (  x>0 && y<0){
            System.out.print(4);
        }



    }
}

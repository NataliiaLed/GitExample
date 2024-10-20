package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N > 0) {
            int[] numbers= new int[N];
            //Collecting elements into array
            for (int i = 0; i < N; i++) {
                numbers[i]= scanner.nextInt();
            }
            if (N%2==0){
                //выводим numbers в обратном порядке
                for (int i=N-1; i >= 0; i--){
                    System.out.println(numbers[i]);
                }
            }
            else {
                // выводим numbers в порядке
                for (int i =0; i< N; i++){
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}

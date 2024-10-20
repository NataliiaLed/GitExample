package ua.javarush.task.pro.task09.task0918;

/* 
Попрацюймо зі StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишіть тут ваш код
        StringBuilder result = new StringBuilder(string);


        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            result.append(str);
        }
        return result;
    }


    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишіть тут ваш код
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);

        return result;
    }
}

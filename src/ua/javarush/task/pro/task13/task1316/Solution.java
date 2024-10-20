package ua.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        JavarushQuest[] values= JavarushQuest.values();
        for (JavarushQuest v : values) {
        System.out.println(v.ordinal());
        }
    }
}

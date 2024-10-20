package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код

        grades.put("qwerw", 1.5);
        grades.put("dfgdf", 1.5);
        grades.put("tr", 1.5);
        grades.put("tyu", 1.5);
        grades.put("nm,", 1.5);
    }
}

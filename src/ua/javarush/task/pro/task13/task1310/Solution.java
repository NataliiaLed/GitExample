package ua.javarush.task.pro.task13.task1310;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* 
Успішність студентів-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентів групи: ");
        printStudents();
        System.out.print("Середній бал групи: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давидов Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишіть тут ваш код
        Set<String> keySet = grades.keySet();
        for (String key: keySet)
        {
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        //напишіть тут ваш код
        int size = grades.size();
        Collection<Double> values = grades.values();
        Double sum = 0d;
        for(Double value: values) {
            sum = sum + value;
        }
        Double averageMark = sum/size;


        return averageMark;

    }

}

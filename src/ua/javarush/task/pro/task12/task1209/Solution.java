package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
        if(name==null){
            return;
        }

        if (waitingEmployees.contains(name)) {
            int i = waitingEmployees.indexOf(name);
            waitingEmployees.set(i,null);
            alreadyGotSalaryEmployees.add(name);
        }








    }
}

package ua.javarush.task.pro.task12.task1205;

/* 
Метод ділення
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //напишіть тут ваш код
        Double a1 = Double.valueOf(a);
        Double b1 = Double.valueOf(b);
        //Double.POSITIVE_INFINITY
        if (a1 > 0 && b1 == 0 ||
                a1.equals(Double.POSITIVE_INFINITY) && b1 >= 0 && !b1.equals(Double.POSITIVE_INFINITY) ||
                a1.equals(Double.NEGATIVE_INFINITY) && b1 < 0 && !b1.equals(Double.NEGATIVE_INFINITY)) {
            System.out.println(Double.POSITIVE_INFINITY);

            //Double.NEGATIVE_INFINITY
            if (a1 < 0 && b1 == 0 ||
                    a1.equals(Double.NEGATIVE_INFINITY) && b1 >= 0 && !b1.equals(Double.POSITIVE_INFINITY) ||
                    a1.equals(Double.POSITIVE_INFINITY) && b1 < 0 && !b1.equals(Double.NEGATIVE_INFINITY)) {
                System.out.println(Double.NEGATIVE_INFINITY);
            }

//Double.NaN
            if (a1 == 0 && b1 == 0 ||
            a1.equals(Double.NaN) || b1.equals(Double.NaN)||
                    a1.equals(Double.POSITIVE_INFINITY) && b1.equals(Double.POSITIVE_INFINITY) ||

                a1.equals(Double.POSITIVE_INFINITY) && b1.equals(Double.NEGATIVE_INFINITY)||

           a1.equals(Double.NEGATIVE_INFINITY) && b1.equals(Double.POSITIVE_INFINITY)||

           a1.equals(Double.NEGATIVE_INFINITY) && b1.equals(Double.NEGATIVE_INFINITY)) {
                System.out.println(Double.NaN);
            }
            } else {
                Double c = a / b;
                System.out.println(c);
            }
        }
    }



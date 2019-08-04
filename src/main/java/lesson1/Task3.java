package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

import java.lang.String;

public class Task3 {

    public static void main(String[] args) {
        String calMethodResult = homeWorkTask(5, "Nataly");
        System.out.print(calMethodResult);

    }

    public static String homeWorkTask(int rowCount, String name) {
        int i = 0;
        String result = "";
        while (i < rowCount -1) {
            String calMethodResult = buidRow(name);
            result = result + calMethodResult + "\n";
            i++;
        }

        return result + buidRow(name);
    }

    public static String buidRow(String name) {

        int ii = 0;
        String result = "";

        while (ii < 9) {
            result = result + name + " ";
            ii++;
        }

        return result + name ;
    }


}
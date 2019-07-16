package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            myLovelyName("Nataly ");
            System.out.println("Nataly");
            i++;

        }
    }

    public static void myLovelyName(String myLovelyName) {

        int ii = 0;

        while (ii < 9) {
            System.out.print(myLovelyName + "");
            ii++;
        }
    }


}
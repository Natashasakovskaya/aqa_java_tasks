package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/


public class Task2 {

    public static void main(String[] args) {

        int a = 5;
        for (int i = 0; i < 11; i++) {
            myLovelyName(a, "Nataly ");
            System.out.println("Nataly");

        }
    }

    public static void myLovelyName(int ii, String myLovelyName) {
        for (int i = 0; i < ii; i++) System.out.print( myLovelyName + "");
    }

    public static void printMyName(String myLovelyName) {
        System.out.println("My name is "+ myLovelyName);
        System.out.println("My name is " + getYourName(myLovelyName));

    }

    public static String getYourName(String myLovelyName) {
        return "Your name is " + myLovelyName;
    }
}
package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        int i = 1;
        while(i < 11){
            System.out.print("Nataly ");
            i++;
            System.out.println("Nataly ");
            i++;

        }
    }

}
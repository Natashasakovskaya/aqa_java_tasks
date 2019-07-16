package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {

        int ee =1;
        int yy =2;
        int zz =3;



        System.out.println(
                min(5,2,3)
        );
        System.out.println(
                min(5,22,3)
        );
        System.out.println(
                min(0,2,0)
        );

        System.out.println(
                min1(5,2,3)
        );
        System.out.println(
                min1(5,22,3)
        );
        System.out.println(
                min1(0,2,0)
        );
    }

    public static int min(int a, int b, int c) {

        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
    public static int min1(int a, int b, int c) {

        int min = c;

        if (min > b) {
            min = b;
        }

        if (min > a) {
            min = a;
        }


        return min;
    }

}

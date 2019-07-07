package Example1;

public class New1 {

    public static void main(String[] args) {

//        String SergiVar = "Sergiy";
//        printName(SergiVar);
//        printName("Nany");
//
//
//        String str = getYourName("Vasy");
//        System.out.println("My computer say:" + str);
//        System.out.println("My computer say:" + getYourName("Kaka"));


//        cucla(5, "Nata");

        int x = 3;
        for (int i = 0; i < x; i++) {
            cucla(x, "Nata");
            System.out.println("");
        }

    }

    public static void cucla(int ii, String name) {
        for (int i = 0; i < ii; i++) {
            System.out.print(name + " ");
        }
    }



    public static void printName(String name) {
        System.out.println("My name is " + name);
//        System.out.println("My name is " + getYourName(name));
    }

    public static String getYourName(String name) {
        return "Your name is " + name;
    }


}

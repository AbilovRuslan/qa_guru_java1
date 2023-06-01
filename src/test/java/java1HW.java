
public class java1HW {
    public static void main (String [] args) {

        //Написать код, использующий большинство или все виды операторов, о которых говорилось в лекции.
        int a = 15;
        int b = 6;
        int c = 7;
        String str1 = "Hello";
        String str2 = "world";

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ " + (a++));
        System.out.println("++a " + (++a));

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        if (a > b && c < b) {
            System.out.println("Значение true");
        } else
            System.out.println("Значение false");

        if (a < b || c > b) {
            System.out.println("Значение true");
        } else
            System.out.println("Значение false");

        System.out.println("str1 + str2 : " + " " + (str1 + str2));

        //Показать примеры операций над разными типами данных (int + long, например)
        int t1 = 15;
        double t2 = 7.3;
        float t3 = 1.4f;
        byte t4 = -78;
        long t5 = 456654655;
        char t6 = 'c';
        String t7 = "Hello";

        double rs1 = t1 / t2;
        double rs2 = t2 + t3;
        long rs3 = t1 * t5;
        int rs4 = t6 + t1;
        String rs5 = t7 + t6;
        String rs6 = t7 + t1;

        System.out.println("int/double :" + rs1);
        System.out.println("double + float :" + rs2);
        System.out.println("double * float :" + rs3);
        System.out.println("char + int :" + rs4);
        System.out.println("String + char :" + rs5);
        System.out.println("String + int :" + rs6);
    }


}
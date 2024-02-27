public class Operatoren {

    public static void main(String[] args) {

        // +, -, *, /

        int a = 35;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //5 (int)

        double c = 3.19;

        System.out.println(c * b);  //19.14 (double)

        System.out.println("----------------");

        // ++, --

        System.out.println(++a);    //jetzt 36
        System.out.println(a++);    //jetzt 36, danach 37
        System.out.println(a);      // 37

        System.out.println(--b);    //5
        System.out.println(b--);    //5
        System.out.println(b);      //4

        System.out.println(--b);
        System.out.println(--b);
        System.out.println(--b);


        System.out.println("---------------");

        //Zuweisungsoperatoren

        int d = 72;

        d +=8;

        System.out.println(d);  //80


    }
}

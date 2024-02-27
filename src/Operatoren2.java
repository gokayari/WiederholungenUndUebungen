public class Operatoren2 {

    public static void main(String[] args) {

        //Vergleichsoperatoren:

        // == , != , > , < , >= , <=

        int a = 30;
        int b = 40;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //logische Operatoren

        int c = 60;

        if (a>b || c>b){
            System.out.println("Die Bedingung ist erfüllt.");
        }
    }
}

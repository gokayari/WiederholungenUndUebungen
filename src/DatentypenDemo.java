public class DatentypenDemo {

    public static void main(String[] args) {

        byte myByte = 30;
        short myShort = 30000;
        int myInt = 35000000;
        long myLong = 100000000000000L;
        float myFloat = 56.33f;
        double myDouble = 66.33;
        char myChar = 'G';
        boolean myBoolean = true;


        // Implizite Typumwandlung

        int impliziteTypumwandlung = myByte;       //Widening Casting (automatically)

        System.out.println(impliziteTypumwandlung); //30>30


        // Explizite Typumwandlung

        int expliziteTypumwandlung = (int) myDouble;    //Narrowing Casting (manually)

        System.out.println(expliziteTypumwandlung); //66.33>66(int)

    }
}

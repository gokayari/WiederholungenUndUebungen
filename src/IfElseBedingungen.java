public class IfElseBedingungen {

    public static void main(String[] args) {

        int uhr = 1000;

        if(uhr < 1200){
            if (uhr == 1000){
                System.out.println("Guten Morgen!");
            }
            System.out.println("Jetzt ist vor Mittag.");

        }else if (uhr == 1200){
            System.out.println("Es ist jetzt 12:00 Uhr.");
        }else{
            System.out.println("Mittlerweile ist es Nachmittag!");
        }


    }
}

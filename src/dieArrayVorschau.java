public class dieArrayVorschau {

    public static void main(String[] args) {
        String[] namen = {"Marcus", "Ece", "Christian", "Stahl"};
        int[] zahlen = {3,5,35,100,2002};

        System.out.println(namen[1]);
        System.out.println(zahlen[4]);
        //System.out.println(zahlen[5]);  //ArrayIndexOutOfBoundsException


        zahlen[4] = 303;       // 2002 geändert in 303
        System.out.println(zahlen[4]);


        // die Länge eines Arrays:

        int arraylange = namen.length;
        System.out.println(arraylange);

        System.out.println("-------------");

        String[] webUrls = {"www.webseite1.com", "www.webseite2.com"};
        System.out.println(webUrls[1]);

        System.out.println("-------------");

        for (int i=0; i < namen.length; i++){
            System.out.println(namen[i]);
        }



    }
}

public class LoopsSchleifen {

    public static void main(String[] args) {

        // "for" loops(schleifen):
        System.out.println(">>>>>>> for-loop <<<<<<<<< ");

        for (int i = 0; i <=15; i++){
            System.out.println("Dies ist der Wert unserer Variablen :" +i);
        }

        for (double i2 = 0; i2 <=5; i2 += 0.25){
            System.out.println("Dies ist der Wert unserer Variablen :" +i2);
        }
        System.out.println("---------------");

        int dieSeite = 5;
        for (int i = 1; i <= dieSeite; i++) {
            System.out.println("Seitenzahl :" + i);
            if (i == 3){
                System.out.println("Bedingung erfüllt!");
            }
        }

        System.out.println("---------------");

        String[] dieNamen = {"Marcus", "Ozan", "Hazal", "Juliette"};

        for (int i = 0; i < dieNamen.length; i++) {
            System.out.println((i + 1) + ". Name von der Liste ist " + dieNamen[i]);
        }


        System.out.println("--------fortgeschrittener Loop---------");

        for (String derName : dieNamen) {
            System.out.println(derName);
        }



        // "while" loops(schleifen):
        System.out.println(">>>>>>> while-loop <<<<<<<<< ");

        int j = 1;

        while (j <= 5){
            System.out.println("Unsere Nummer mit while-loop: " +j);
            j++;
        }

        System.out.println("-----------");

        int k = 1;
        while (true){
            if (k>5){
                break;
            }
            System.out.println("Unsere Nummer mit 2.while-loop: " +k);
            k++;
        }


        // "do-while" loops(schleifen):
        System.out.println(">>>>>>> do-while-loop <<<<<<<<< ");

        int l = 1;
        do {
            System.out.println("Unsere Nummer mit do-while-loop: " +l);
            l++;
        }while(l<=5);


    }
}

public class SwitchCase {

    public static void main(String[] args) {

        int monat = 13;

        switch (monat){
            case 1:
                System.out.println("Der jetzige Monat ist Januar.");
                break;
            case 2:
                System.out.println("Der jetzige Monat ist Februar.");
                break;
            case 3:
                System.out.println("Der jetzige Monat ist März.");
                break;
            case 4:
                System.out.println("Der jetzige Monat ist April.");
                break;
            case 5:
                System.out.println("Der jetzige Monat ist Mai.");
                break;
            case 6:
                System.out.println("Der jetzige Monat ist Juni.");
                break;
            case 7:
                System.out.println("Der jetzige Monat ist Juli.");
                break;
            case 8:
                System.out.println("Der jetzige Monat ist August.");
                break;
            case 9:
                System.out.println("Der jetzige Monat ist September.");
                break;
            case 10:
                System.out.println("Der jetzige Monat ist Oktober.");
                break;
            case 11:
                System.out.println("Der jetzige Monat ist November.");
                break;
            case 12:
                System.out.println("Der jetzige Monat ist Dezember.");
                break;
            default:
                System.out.println("Ungültiger Wert eingegeben!!");
        }


        System.out.println("-------------");

        String browser = "Chrome";

        switch (browser){
            case "Chrome":
                System.out.println("Der Chrome-Browser wird gestartet...");
                break;
            case "Firefox":
                System.out.println("Der Firefox-Browser wird gestartet...");
                break;
            default:
                System.out.println("Ein unbekannter Browser!");
        }


        System.out.println("-----------------");
        //So verwenden wir Switch in Java 14 und späteren Versionen:

        int n = 1;
/*
        switch (n) {
            case 1 -> System.out.println("Die Nummer ist 1.");
            case 2 -> System.out.println("Die Nummer ist 2.");
            case 3 -> System.out.println("Die Nummer ist 3.");
            case 4 -> System.out.println("Die Nummer ist 4.");
            case 5 -> System.out.println("Die Nummer ist 5.");
        }

 */

    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {

        HashMap<String, String> erstesAuto = new HashMap<>();
        erstesAuto.put("Die Marke", "Audi");
        erstesAuto.put("Das Modell", "A4");
        erstesAuto.put("Die Erstzulassung", "2019");
        erstesAuto.put("Der Preis", "€25000");

        HashMap <String, String> zweitesAuto = new HashMap<>();
        zweitesAuto.put("Die Marke", "BMW");
        zweitesAuto.put("Das Modell", "3er-Reihe");
        zweitesAuto.put("Die Erstzulassung", "2018");
        zweitesAuto.put("Der Preis", "€27000");

        HashMap <String, String> drittesAuto = new HashMap<>();
        drittesAuto.put("Die Marke", "Mercedes");
        drittesAuto.put("Das Modell", "C-Klasse");
        drittesAuto.put("Die Erstzulassung", "2020");
        drittesAuto.put("Der Preis", "€28000");

        System.out.println(erstesAuto);
        System.out.println(zweitesAuto);
        System.out.println(drittesAuto);


        ArrayList<HashMap<String, String>> autosliste = new ArrayList<>();
        autosliste.add(erstesAuto);
        autosliste.add(zweitesAuto);
        autosliste.add(drittesAuto);

        System.out.println("-----------------------");

        System.out.println(autosliste);
        System.out.println(autosliste.get(0));


    }
}

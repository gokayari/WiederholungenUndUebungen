import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> dieNamensListe = new ArrayList<>();

        dieNamensListe.add("Hakan");
        dieNamensListe.add("Mark");
        System.out.println(dieNamensListe);
        dieNamensListe.add("Sude");
        dieNamensListe.add("Mehmet");

        System.out.println(dieNamensListe);         //[Hakan, Mark, Sude, Mehmet]
        System.out.println(dieNamensListe.get(0));  //Hakan

        dieNamensListe.set(1, "Christoph");
        System.out.println(dieNamensListe);     //[Hakan, Christoph, Sude, Mehmet]

        String derGelöschteName = dieNamensListe.remove(0);
        System.out.println("Der Name " + derGelöschteName + " wurde von der Liste gelöscht!");

        System.out.println(dieNamensListe);

        dieNamensListe.add("Canberk");
        dieNamensListe.add("Sofia");
        dieNamensListe.add("Salih");

        System.out.println(dieNamensListe);

        System.out.println("Anzahl der Elemente in der Liste: " + dieNamensListe.size());

        System.out.println("Liste hat Mehmet: " + dieNamensListe.contains("Mehmet"));
        System.out.println("Liste hat Ayse: " + dieNamensListe.contains("Ayse"));

        System.out.println("Nummer von Sofia in der Liste: " + dieNamensListe.indexOf("Sofia"));

        System.out.println("dieNamensListe ist leer: " + dieNamensListe.isEmpty());

        System.out.println("-----------");

        for (String derName : dieNamensListe) {
            System.out.println(derName);
        }

    }
}

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> schülernote = new HashMap<>();
        schülernote.put("Adrianna", 100);
        schülernote.put("Mark", 75);
        schülernote.put("Ahmed", 90);

        System.out.println(schülernote);
        System.out.println("Die Note von Mark ist " + schülernote.get("Mark"));
        System.out.println("Alle Schlüsselwerte: " + schülernote.keySet());
        System.out.println("Alle Werte: " + schülernote.values());
        System.out.println("Alle Eingabepaare: " + schülernote.entrySet());

        schülernote.replace("Ahmed", 80);
        System.out.println(schülernote);

        schülernote.remove("Mark");
        System.out.println(schülernote);
    }
}

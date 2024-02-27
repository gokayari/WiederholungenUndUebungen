public class dieStringVorschau {
    public static void main(String[] args) {

        String ersterText = "die Testautomatisierung";
        String zweiterText = "der SoftwareTest";

        int textlänge1 = ersterText.length();
        System.out.println(textlänge1);

        int textlänge2 = zweiterText.length();
        System.out.println(textlänge2);

        System.out.println("-------------");


        String text1 = "JAVA ist eine wunderschöne Programmiersprache";

        System.out.println(text1.toLowerCase());
        System.out.println(text1.toUpperCase());

        System.out.println("-------------");

        System.out.println(ersterText + zweiterText);

        System.out.println(ersterText + textlänge1 + zweiterText + textlänge2);


    }
}

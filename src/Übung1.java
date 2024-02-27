public class Übung1 {
    public static void main(String[] args) {

        // Ersetzen "l" >>> 1:

        String hello = "Hallo Welt!";
        int längeDesStrings = hello.length();

        String neuesString = "";


        for (int i = 0; i < längeDesStrings ; i++) {
            char jetzigerCharakter = hello.charAt(i);
            if (jetzigerCharakter != 'l'){
                neuesString = neuesString + jetzigerCharakter;
            }else{
                neuesString = neuesString + 1;
            }
        }

        System.out.println(neuesString);

    }
}

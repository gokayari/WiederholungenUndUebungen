public class TryCatchDemo {
    public static void main(String[] args) {

        int [] zahlen = {1,5,10,500,999};

        //System.out.println(zahlen[5]);    //ArrayIndexOutOfBoundsException

        try{
            System.out.println(zahlen[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Nach dem Fehler wird dies in die Konsole ausgeschrieben.");

        try{
            System.out.println(zahlen[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Nach dem Fehler wird dies in die Konsole ausgeschrieben.");

    }
}

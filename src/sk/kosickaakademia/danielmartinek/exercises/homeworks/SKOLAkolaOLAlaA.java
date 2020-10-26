package sk.kosickaakademia.danielmartinek.exercises.homeworks;

public class SKOLAkolaOLAlaA {
    public static void main(String[] args) {
        String text = "ŠKOLA";
        skolaVola(text);
    }

    /*
    Táto metóda mi trvala asi 50 minút :DD  a potom som ju pomocou návrhov od IntelliJ IDEA skrátil syntax na MIN
    vypisuje vstupný reťazec v každom novom riadku o začiatočné písmenko menej
     */
    public static void skolaVola(String text){
        int len = text.length();
        int lines = len;                                        // helpfull variable for printing lines
        while(lines>0){                                         // while lenght of String will become zero
            for (int i=0; i<len; i++ )                          // statement of one line
                if (len == lines || i >= len - lines) {         // if you are on right line you can print string
                    System.out.print(text.charAt(i));
                }
            System.out.println( );                              // next line
            lines--;
        }
    }
}








/*
public static void skolaVola(String text){        // pôvodná syntaxne neokresaná metóda
        int len = text.length();
        int lines = len;

        while(lines>0){
            for (int i=0; i<len; i++ ){
                if (len == lines) {
                    System.out.print(text.charAt(i));
                }else{
                    if (i>=(len-lines)){
                        System.out.print(text.charAt(i));
                    }
                }
            }
            System.out.println( );
            lines--;
        }
    }
 */
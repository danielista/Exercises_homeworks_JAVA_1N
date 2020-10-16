package sk.kosickaakademia.danielmartinek.exercises.homeworks;

public class SKOLAkolaOLAlaA {
    public static void main(String[] args) {
        String text = "SKOLA";
        skolaVola(text);
    }
    public static void skolaVola(String text){
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
}




/*
public static void skolaVola(String text){
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
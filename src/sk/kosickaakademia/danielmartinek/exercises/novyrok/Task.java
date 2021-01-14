package sk.kosickaakademia.danielmartinek.exercises.novyrok;

import java.util.Scanner;

public class Task {


    public int suc(int a, int b){
        return a+b;
    }


    public boolean isPrimeNumber(int m){
        for(int i=2; i<Math.sqrt(m);i++){
            if(m%i == 0)
                return false;
        }
        return true;
    }

    public boolean isRectangularly (int a, int b, int c){

        if (a+b < c || a+c <b || c+b<a || (a<1 && b<1 && c<1))return false;
           // System.out.println("NEDA SA ZOSTRAOJIŤ TORJUHOLNIK");
        else if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))return true;
            //System.out.println("TROJUHOLNIK JE PRAVOUHLY");
        else return false; // System.out.println("TROJUHOLNIK NEJE PRAVOUHLY");

    }


    //HOMEWOOOOOOOOOORK ;)
    public String reversed (String input){

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new String(result);
    }


    public int pocetMedzier(String text){
        int len = text.length();
        int pMedzier=0, pMalych=0, pVelkych=0, pCisel=0, pSlov=0, pViet=1;
        for (int i=0; i<len; i++) {
            char z = text.charAt(i);
            if (z >= 'A' && z <= 'Z') pVelkych++;
            if (z >= 'a' && z <= 'z') pMalych++;
            if (z >= '0' && z <= '9') pCisel++;
            if (z == '.' && text.charAt(i+1) == ' ') pViet++;
            if (z == ' ') pMedzier++;

            pSlov = pMedzier+1;

        }
        System.out.println("pocet Medzier je: " + pMedzier );

     /*   System.out.println("pocet Slov je: " + pSlov );
        System.out.println("pocet velkych písmen je: " + pVelkych  );
        System.out.println("pocet malych písmen je: " + pMalych  );
        System.out.println("pocet číslic je: " + pCisel  );
        System.out.println("pocet viet je: " + pViet  );   */

        return pMedzier;
    }

    public boolean isBinary (String number){
        boolean is = true;
        number = number.toLowerCase();
        int len = number.length();
        for (int i = 0; len > i; i++){
            char z = number.charAt(i);
            if (z!= '0' && z != '1') {
                is = false;
                break;
            }
        }
        return is;
    }

    public int vowelConter(String data){
        int len = data.length();
        int vowelSUMMARY = 0;
        data = data.toLowerCase();
        for (int i = 0; len > i; i++){
            char z=data.charAt(i);
            if (z == 'a' || z=='e' || z=='i' || z=='o' || z=='u' || z=='y'){
                vowelSUMMARY++;
            }
        }
        System.out.println(vowelSUMMARY);
        return vowelSUMMARY;
    }



}

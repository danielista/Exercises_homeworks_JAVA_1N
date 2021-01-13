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



}

package sk.kosickaakademia.danielmartinek.exercises;

import java.util.Scanner;

public class myRANDOM {
    public static void main(String[] args) { //0,1465432 -> 14,153465
      int max = 122;
      guessNumber(max);
    }

    public static void guessNumber (int max){
        int randomNUMBER = (int)(Math.random()*max + 1);  //100 daj max
        Scanner skenerik = new Scanner(System.in);
        int guess;
        int attempt = 0;
        do {
            System.out.println("zadaj čislo kámo: ");
            guess=skenerik.nextInt();
            if(guess==randomNUMBER){
                System.out.println("UHADOL SI ;)");
            }else if (guess >= randomNUMBER){
                System.out.println("skús vyššie číslo");
            }else System.out.println("skús menšie číslo :D");
        }while(guess != randomNUMBER);
    }

}

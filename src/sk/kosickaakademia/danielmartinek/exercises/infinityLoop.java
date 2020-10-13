package sk.kosickaakademia.danielmartinek.exercises;

import java.util.Scanner;

public class infinityLoop {
    public static void main(String[] args) {
        System.out.println("ZADAJ CISLO");
        int summary = 0;
        int number = 0;
        int opakujesa = 22;
        do{
                Scanner skenerik = new Scanner(System.in);
                number = skenerik.nextInt();
                if (number == 0 || number==opakujesa){
                    break;
                }else {
                    summary += number;
                    System.out.println(summary);
                }
            opakujesa = number;
        }
        while (true);
    }
}

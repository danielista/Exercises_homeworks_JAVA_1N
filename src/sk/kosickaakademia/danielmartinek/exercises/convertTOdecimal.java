package sk.kosickaakademia.danielmartinek.exercises;

import java.util.Scanner;

public class convertTOdecimal {
    public static void main(String args[]){
        String binaryString="1001011";
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);


        String octalString="1273";
        decimal=Integer.parseInt(octalString,8);
        System.out.println(decimal);


        String hex="5B3";
        decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);

        Scanner skenerik = new Scanner(System.in);
        System.out.println("Pleaase enter the number: ");
        int number = skenerik.nextInt();

        conBinToDec(number);

    }

public static void conBinToDec (int number){
        int result = 0, i=0;
        while (number != 0){
        result = (int) (result + ((number%10) * Math.pow(2,i)));
            number /= 10;
            i++;
        }

    System.out.println(result);
}


}
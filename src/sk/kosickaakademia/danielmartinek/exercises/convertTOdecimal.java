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
        String hexa = skenerik.next();
        conHexToDec(hexa);

        //int number = skenerik.nextInt();
        //conBinToDec(number);

    }

    public static void conHexToDec (String number){
        int result =0;
        int len = number.length();
        for (int i = 0; len>i; i++){
            char poslednyZNAK = number.charAt(len-i-1);
            switch (poslednyZNAK) {
                case '0' -> result = result + 0;
                case '1' -> result = result + (int) Math.pow(16, i);
                case '2' -> result = result + 2 * (int) Math.pow(16, i);
                case '3' -> result = result + 3 * (int) Math.pow(16, i);
                case '4' -> result = result + 4 * (int) Math.pow(16, i);
                case '5' -> result = result + 5 * (int) Math.pow(16, i);
                case '6' -> result = result + 6 * (int) Math.pow(16, i);
                case '7' -> result = result + 7 * (int) Math.pow(16, i);
                case '8' -> result = result + 8 * (int) Math.pow(16, i);
                case '9' -> result = result + 9 * (int) Math.pow(16, i);
                case 'A', 'a' -> result = result + 10 * (int) Math.pow(16, i);
                case 'B', 'b' -> result = result + 11 * (int) Math.pow(16, i);
                case 'C', 'c' -> result = result + 12 * (int) Math.pow(16, i);
                case 'D', 'd' -> result = result + 13 * (int) Math.pow(16, i);
                case 'E', 'e' -> result = result + 14 * (int) Math.pow(16, i);
                case 'F', 'f' -> result = result + 15 * (int) Math.pow(16, i);
                default -> throw new IllegalStateException("Unexpected value: " + poslednyZNAK);
            }
        }
        System.out.println(result);
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
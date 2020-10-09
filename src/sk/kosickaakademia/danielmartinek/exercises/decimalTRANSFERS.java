package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

// Na vstupe žiada číslo a hodnotu do akej sustavy chceme preložiť sustavu 2,8,16
// vraj to robiť cez STRINGY :D lebo pri 16 už musime :D
// takže ošetriť treba zle vstupy kým nezoberie dobrý vstup :D
// vraj sa da aj farebne vypisovať do kozoly :DDDDDD
//


public class decimalTRANSFERS {
    public static void main(String[] args) {

        Scanner skenerik = new Scanner(System.in);
        System.out.print("CONVERTOR FROM DECIMAL TO BINARY, OCTAL AND HEXADECIMAL: \n " +
                "Please enter valid positive decimal number:");


        int number = skenerik.nextInt();
            do {
                if (number<0){
                    System.out.println("NEMOŽEŠ ZAPORNE ZADAVAŤ !!!");
                    number = skenerik.nextInt();
                }
            }while ( number <0 );


        System.out.println("Please tap B for BINARY, O for OCTAL or H for HEXADECIMAL");
        String system = skenerik.next();


        switch(system) {
             case "B": case "b" :
                System.out.print(Integer.toBinaryString(number));
                System.out.println("Number in binary: " + binary(number));
                break;
             case "o" : case "O" :
                System.out.println("Number in octal: " + octal(number));
                break;
             case "H": case "h" :
                System.out.print(Integer.toHexString(number));
                System.out.print(hexadecimal(number));
                break;
        }









    }
    //////////////////// TU KONCI MAIN METODAA //////////////////////

    private static String hexadecimal(long number){
        String hex = " ";
        while ( number>0 ){                              //
            if (number%16 <= 9) {                        //
                hex = hex + number%16;          //
            }else{
                int pismenko = (int) (number%16);
                switch(pismenko) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                }
            }number /= 16;
        }
       return reverse(hex);

    }

    private static String reverse(String otocmaprosim){
        String vstupnyString = otocmaprosim;

        String[] result = new String[vstupnyString.length()];

        for (int i = 0; i < vstupnyString.length(); i++) result[i] = vstupnyString[vstupnyString.length() - i - 1];

        System.out.println((String.valueOf(result)));
    }


    private static long octal(long number){
        long octal = 1;
        while ( number>0 ){                              //
            if (number%8 != 0) {                         //
                octal = (octal * 10) + (number%8);       //
            }else {
                octal = octal * 10;                      //
            }number /= 8;                                //
        }
        return reverse(octal);
    }


    private static long binary(long number) {
        long binary = 1;
        while ( number>0 ){                     // until number become a ZERO
            if (number%2 == 1) {                  // The rest of integer by dividing by 2
                binary = binary * 10 + 1;       // add an ONE to end
            }else {
                binary = binary * 10;              // add ZERO to the end
            }number /= 2;                        // divide the number
        }
        return reverse(binary);
    }

    private static long reverse(long fuckinginput) {
        long reversed = 1;
        int i=0;
        while(fuckinginput != 0) {
            long digit = fuckinginput % 10;
            reversed = reversed * 10 + digit;
            fuckinginput /= 10;
            i++;
        }
        reversed %= (Math.pow(10,i));
        reversed /= 10;

        return reversed;
    }

}
package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

// APPLICATION which convert positive decimal number to selected number system (bin,oct or hexadec)


public class decimalTRANSFERS {
    public static void main(String[] args) {


        Scanner skenerik = new Scanner(System.in);
        System.out.print("CONVERTOR FROM DECIMAL TO BINARY, OCTAL AND HEXADECIMAL: \n " +
                "Please enter valid positive decimal number:");

        boolean input = false;                                          // Ošetrenie zadávania vstupných hodnôt
        int number = skenerik.nextInt();                                // DO WHILE loop
            do if (number < 0) {
                System.out.println("NEMOŽEŠ ZAPORNE ZADAVAŤ !!!  Please ENTER IT AGAIN ;)");
                number = skenerik.nextInt();
                input = false;
            } else
                input = true;
            while (!input);                   // while input is not valid


        do{
            System.out.println("Please tap B for BINARY, O for OCTAL or H for HEXADECIMAL");
            String system = skenerik.next();

                switch (system) {
                    case "B", "b" -> {
                        input = true;
                        System.out.println("Number in binary: " + binary(number));
                    }
                    case "o", "O" -> {
                        input = true;
                        System.out.println("Number in octal: " + octal(number));
                    }
                    case "H", "h" -> {
                        input = true;
                        System.out.print(hexadecimal(number));
                    }
                    default -> {
                        input = false;
                        System.out.println("POSNAŽ SA TRAFIŤ DO SPRÁVNEJ KLÁVESY");
                        system = skenerik.next();
                    }
                }
        }while (!input);

        // System.out.print(Integer.toBinaryString(number));        // one line methods conversions to chosen system
        // System.out.print(Integer.toOctalString(number));         // jednoriadkove metody na prevod do sustav
        // System.out.print(Integer.toHexString(number));



    }
    //////////////////// TU KONCI MAIN METODAA //////////////////////

    private static String hexadecimal(long number){               // METHOD which convert decimal to HEXAdeci (from long to String on input)
        String hex = " ";
        while ( number>0 ){
            if (number%16 <= 9) hex = hex + number % 16;                     // delenie 16 so zvyškom
            else{
                int pismenko = (int) (number%16);
                // SWITCH case na ošetrenie pre každé písmenko
                hex = switch (pismenko) {
                    case 10 -> hex + "A";
                    case 11 -> hex + "B";
                    case 12 -> hex + "C";
                    case 13 -> hex + "D";
                    case 14 -> hex + "E";
                    case 15 -> hex + "F";
                    default -> hex;
                };
            }
            number /= 16;
        }
       return reverse(hex);
    }
    /* //////////////////////////////////////////////////////////////////
    /////////OVELA JEDNODUCHSIA A CEZ POLE ROBENA METODA deciToHexade/////////
    ///////////////////////////////////////////////////////////////////////////////
    public static String toHex(int decimal){
     int rem;
     String hex="";
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    while(decimal>0)
     {
       rem=decimal%16;
       hex=hexchars[rem]+hex;
       decimal=decimal/16;
     }
    return hex;
}
     */


    public static String reverse(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
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
    /*// TO ISTE decimalToOctal oveľa efektívnejšou metodou ;) čum a uč sa ;) :D //

    public static String toOctal(int decimal){
        int rem;                                                            //declaring variable to store remainder
        String octal="";                                                    //declareing variable to store octal
        char octalchars[]={'0','1','2','3','4','5','6','7'};                //declaring array of octal numbers
        while(decimal>0)                                                    //writing logic of decimal to octal conversion
        {
           rem=decimal%8;
           octal=octalchars[rem]+octal;
           decimal=decimal/8;
        }
        return octal;
    }
     */





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

/*
░░░░░░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░░░░░░░░
░░░░░░▄▄████▀▀▀▀▀░░░░░░▀▀█▄▄░░░░░░░░░
░░░▄██▀▀░░░░░░░░░░░░░░░░░░▀██▄░░░░░░░
░░▄█▀░░░░░░░░░░░░░░░░░░░░░░░░▀█▄░░░░░
░██░░░░░░░░░░░░░░░░░░░░░░░░░░░▀█▄░░░░
██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀█▄░░░
██░░░░░░░░░░░░░░░░░░░░░░░░░▄▄▄░░▀█░░░
█░░░░░░░░░░░░░░░░░░░░░░░░░░▀██▄░░██░░
█░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░█▄░
█░░░░░▀▀▀█░░░░░░░░░░░░░░░░░░░░░░░░██░
█░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄█████▀░█▄
█░░░░░░░░░░▄▄▄▄▄██████▀▀▀▀▀▀░░░░░░░██
█░░░░▄█████▀▀▀▀▀░▄▄▄████░░░░░░░░░░░██
██░░░░░░░░░░░░░░░░▀░░░░░░░░░░░░░░░░██
▀█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▀
░▀█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█░
░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░
░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█░░
░░░░▀██▄░░░░░░░░░░░░░░░░░░░░░░▄▄█▀░░░
░░░░░░▀██▄░░░░░░░░░░░░░░░░░▄▄█▀░░░░░░
░░░░░░░░░▀██▄░░░░░░░░░░░▄▄█▀░░░░░░░░░
░░░░░░░░░░░░▀██▄▄▄▄▄▄▄▄█▀░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░

 */
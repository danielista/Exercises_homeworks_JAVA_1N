package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

// Na vstupe žiada číslo a hodnotu do akej sustavy chceme preložiť sustavu
// takže ošetriť treba zle vstupy kým nezoberie dobrý vstup :D
// vraj sa da aj farebne vypisovať do kozoly :DDDDDD
//


public class decimalTRANSFERS {
    public static void main(String[] args) {

        Scanner skenerik = new Scanner(System.in);
        System.out.println("CONVERTOR TO BINARY FROM DECIMAL: Please enter decimal number: ");
        int number = skenerik.nextInt();
        int i = number;
        int binary = 1;
        int octal = number;


        while ( number>0 ){                     // until number become a ZERO
            if (number%2 == 1) {                  // The rest of integer by dividing by 2
                binary = binary * 10 + 1;       // add an ONE to end
            }else {
                binary = binary * 10;              // add ZERO to the end
            }number /= 2;                        // divide the number
        }

        binary = reverse(binary);
        System.out.println("An inverted number in binary: "+binary);
        System.out.print("TOTO JE CEZ METODU Z NETU V JAVE JE Binary representation of "+i+":  ");
        System.out.print(Integer.toBinaryString(i));

    }
    //////////////////// TU KONCI MAIN METODAA //////////////////////
    private static int reverse(int fuckinginput) {
        int reversed = 1;
        int i=0;
        while(fuckinginput != 0) {
            int digit = fuckinginput % 10;
            reversed = reversed * 10 + digit;
            fuckinginput /= 10;
            i++;
        }
        reversed %= (Math.pow(10,i));
        reversed /= 10;

        return reversed;
    }

}
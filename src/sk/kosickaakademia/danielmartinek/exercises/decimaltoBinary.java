package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

public class decimaltoBinary {
    public static void main(String[] args) {

        Scanner skenerik = new Scanner(System.in);
        System.out.println("CONVERTOR TO BINARY FROM DECIMAL: Please enter decimal number: ");
        int number = skenerik.nextInt();
        int i = number;
        int binary = 1;

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
    private static int reverse(int binary) {
        int reversed = 1;
        int i=0;
        while(binary != 0) {
            int digit = binary % 10;
            reversed = reversed * 10 + digit;
            binary /= 10;
            i++;
        }
        reversed %= (Math.pow(10,i));
        reversed /= 10;

        return reversed;
    }

}
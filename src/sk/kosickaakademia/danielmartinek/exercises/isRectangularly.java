package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

public class isRectangularly {
    public static void main(String[] args) {

        Scanner skenerik = new Scanner(System.in);
        System.out.println("IS IT rectangularly TRIANGLE? : Please enter a numbers A, B, and C: ");
        int a = skenerik.nextInt();
        int b = skenerik.nextInt();
        int c = skenerik.nextInt();
        if (a+b < c || a+c <b || c+b<a || (a<1 && b<1 && c<1))
            System.out.println("NEDA SA ZOSTRAOJIŤ TORJUHOLNIK");
        else if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            System.out.println("TROJUHOLNIK JE PRAVOUHLY");
        else System.out.println("TROJUHOLNIK NEJE PRAVOUHLY");
    }

}

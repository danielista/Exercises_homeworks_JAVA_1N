package sk.kosickaakademia.danielmartinek.exercises;

import java.util.Scanner;

public class forPyramideSquare {
    public static void main(String[] args) {

        pyramida();
        stvorec();


    }
/////////////////////////////////////////////////////////
/////////// K.O.N.I.E.C  M.A.I.N  M.E.T.O.D.Y //////////
/////////////////////////////////////////////////////////

    public static void pyramida (){
        Scanner skenerik = new Scanner(System.in);
        System.out.println("PYRAMIDE: Please enter a number: ");
        int rows = skenerik.nextInt();

        int k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {        //VRCHNA PYRAMIDA
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("   ");
            }
           /* while(k != i){              //VLAVO TROJHOLNIK
                System.out.print("* ");
                ++k;
            }*/

            while(k != 2 * i - 1) {  //NORMALNA PYRAMIDA
                System.out.print("█  ");
                ++k;
            }
            System.out.println();
        }

        for(int i = rows-1; i >= 1; --i, k = 0) { //SPODNA PYRAMIDA (-1 riadok)
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("   ");
            }

            while(k != 2 * i - 1) {  //NORMALNA PYRAMIDA
                System.out.print("█  ");
                ++k;
            }

                    /*
                    while(k != i){              //VLAVO TROJHOLNIK
                        System.out.print("* ");
                        ++k;
                    }*/

            System.out.println();
        }


    }

    public static void stvorec (){

        Scanner skenerik = new Scanner(System.in);
        System.out.println("SQUARE: Please enter a number: ");
        int n = skenerik.nextInt();

        if (n==1)
            System.out.println("#  ");
        else {
            for (int i = 1; i <= n; i++) //vypíše jeden riadok #-ov
                System.out.print("#  ");
            System.out.println("   ");

            for(int i = 1; i<=n-2; i++){
                System.out.print("#  ");
                for(int j=1; j <= n-2; j++){
                    System.out.print("   ");
                }
                System.out.println("#  ");

            }
            for (int i=1; i<=n; i++){
                System.out.print("#  ");
            }
        }
    }




}

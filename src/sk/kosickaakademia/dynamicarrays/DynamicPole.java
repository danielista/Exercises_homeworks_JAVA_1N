package sk.kosickaakademia.dynamicarrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DynamicPole {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ARRAY of numbers: ");
        int cislo = sc.nextInt();
        ArrayList<Integer> pole = new ArrayList<>(cislo);

        for (int i=0; i<cislo; i++)
        {
            pole.add(rand.nextInt(cislo));
        }

        for (Integer help: pole){
            System.out.print(pole.get(help) + " ");
        }

        System.out.println();
        System.out.print("(enter your number) Check if your number is in the array: ");
        cislo = sc.nextInt();

            if(pole.contains(cislo)){
                System.out.println("Pole obsahuje Tvoje číslo");
            }else System.out.println("Pole neobsahuje Tvoje číslo");

        ArrayList<Integer> topPole = new ArrayList<>(cislo);
        for (int i=0; i<pole.size(); i++){
            int help =0;
            for (int j=0; j<(pole.size()); j++){
                if (pole.get(j)==pole.get(i)){
                    help++;
                }
            }
            topPole.add(help);
        }
        for (Integer ej: topPole){
            System.out.print(topPole.get(ej) + " ");
        }



       /* try{
            System.out.println("prvkov v poli je:" + pole.size());
            System.out.println(pole.get(1));
            pole.remove(0);
            System.out.println(pole.get(1));
            System.out.println(pole.get(2));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Error: " + ex);
        }

        */
    }
}


// zisti ci sa cislo nachadza v poli
// zisti ktore cislo sa nachádza najviac krat :D

// databazy 3 selecty 2 updaty a 1 delete
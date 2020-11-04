package sk.kosickaakademia.daniel.martinek.algorithms;

public class Faktorial {


    public static void main(String[] args) {


        int result = fakt(11);
        System.out.println("Faktorial: "+result);

         result = fakDano(11);
        System.out.println("Faktorial: "+result);
    }

    // bez rekurzie ale je to plnohodnotny faktorial
    private static int fakDano(int i) {
        int fak = 1;
        for (int m = 1; m<i; m++){
            fak = fak * (m+1);
        }
        return fak;
    }


    // učiteľov faktorial.. nechapem keĎ je return 1, tak nevrati jednotku ale faktorial to znamená že jednotku chápe ako TRUE hodnotu?ta metoda?
    private static int fakt(int v) {
        // rekurzivna metoda - metoda ktora v svojom tele spusta seba samu
        if(v==1)
            return 1;
        else
            return v*fakt(v-1);
    }



}
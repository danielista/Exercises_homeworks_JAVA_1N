package sk.kosickaakademia.danielmartinek.exercises;

// takže metoda moja zo vstupneho pola zrata počet parnych čísel a vytvori pole iba s nima :D ;)

public class poleParnychCisel {
    public static void main(String[] args) {
        int[] poleCisel = {12, 4, 5, 6, 7, 4, 6,3,2,2,1,8};
       makeEvenArray(poleCisel);

    }


    public static void makeEvenArray (int[] poleCisel){
        int even = 0;
        int len = poleCisel.length;
        for(int i = 0; len > i; i++) {
            if(poleCisel[i]%2==0)
                even++;
        }
        System.out.println("pocet parnych cisle je: " + even);
        String[] evenEvenNumbersArray = new String[even];

        for(int i = 0, j=0; len > i; i++) {
            if(poleCisel[i]%2==0){
                evenEvenNumbersArray[j] = String.valueOf(poleCisel[i]);
                System.out.print( evenEvenNumbersArray[j] + " ");
                j++;
            }
        }
    }



}


/*
        ░░░░░░░░░░░░░░░░░░░░░░█████████
        ░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███
        ░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███
        ░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
        ░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███
        ░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██
        ░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
        ░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██
        ░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██
        ██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██
        █▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██
        ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
        ░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
        ░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█
        ░░████████████░░░█████████████████

*/

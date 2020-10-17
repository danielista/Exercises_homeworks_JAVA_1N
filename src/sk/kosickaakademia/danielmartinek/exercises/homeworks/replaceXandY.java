package sk.kosickaakademia.danielmartinek.exercises.homeworks;

/* 2. Vypiste vsetky cisla 8X75Y2, kde X a Y nahradite cislicami tak,
 aby zadane cislo bolo delitelne cislom 91.


 Riešenie :D po hodine hľadania a skúšania ako sa urobí číslo zo Stringu
 som to radšej spravil po starom .. a plus snažil sa pochopiť Kikov kod :D a aj pochopil
 Kiko nema ošetrene nuly.. takže to má zle :P  Ja ale mám aj nuly ošetrene..
 ale asi som pri tom strávil trochu viac času ako Kiko :D

 Ďalšiu hodinu som stratil s DEBUGOM, lebo zápis  " cislo = (cislo*10) + i; "
            NENI TO ISTE != čo                    " cislo *= 10 + i; "
 */


public class replaceXandY {
    public static void main(String[] args) {

        String number = "8X75Y2";
        replaceChars(number);

    }

    public static void replaceChars(String number){
        int len = number.length();
        int cislo=0;

        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < len; k++) {
                    int cha = number.charAt(k);       // var cha means char :D  cha-cha
                    if (cha == 88)
                        cislo = (cislo * 10) + i;     // if the char is equal to 'X' and replaced the X by i (from for loop)
                    else if (cha == 89)
                        cislo = (cislo * 10) + j;     // if the char is equal to 'Y' and replaced the Y by j (from for loop)
                    else cislo = cislo * 10 + Character.getNumericValue(cha);
                }

                // Checking DIVISIBILITY of the current number
                if (cislo % 92 == 0) System.out.print(cislo + " ");
                cislo = 0;
            }
        }
    }

}

/*
 .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.
| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
| |     ____     | || |  ____  ____  | || |   _______    | || |   _______    | || |  ____  ____  | || |    _____     | |
| |   .' __ '.   | || | |_  _||_  _| | || |  |  ___  |   | || |  |  _____|   | || | |_  _||_  _| | || |   / ___ `.   | |
| |   | (__) |   | || |   \ \  / /   | || |  |_/  / /    | || |  | |____     | || |   \ \  / /   | || |  |_/___) |   | |
| |   .`____'.   | || |    > `' <    | || |      / /     | || |  '_.____''.  | || |    \ \/ /    | || |   .'____.'   | |
| |  | (____) |  | || |  _/ /'`\ \_  | || |     / /      | || |  | \____) |  | || |    _|  |_    | || |  / /____     | |
| |  `.______.'  | || | |____||____| | || |    /_/       | || |   \______.'  | || |   |______|   | || |  |_______|   | |
| |              | || |              | || |              | || |              | || |              | || |              | |
| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'
 */
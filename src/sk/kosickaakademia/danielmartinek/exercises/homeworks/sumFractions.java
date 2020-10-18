package sk.kosickaakademia.danielmartinek.exercises.homeworks;
/*
  ______              _   _                _____
 |  ____|            | | (_)              / ____|
 | |__ _ __ __ _  ___| |_ _  ___  _ __   | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _
 |  __| '__/ _` |/ __| __| |/ _ \| '_ \   \___ \| | | | '_ ` _ \| '_ ` _ \ / _` | '__| | | |
 | |  | | | (_| | (__| |_| | (_) | | | |  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |
 |_|  |_|  \__,_|\___|\__|_|\___/|_| |_| |_____/ \__,_|_| |_| |_|_| |_| |_|\__,_|_|   \__, |
                                                                                       __/ |
                                                                                      |___/
            3. Urobte program, ktory spocita kolko je:
            1 + 1/2+ 1/3 + 1/4 + 1/5+ 1/6 +..........+1/98+1/99+1/100
 */
public class sumFractions {
    public static void main(String[] args) {
        double summary =0;
        for (double i=1.00; i<101; i++) summary = summary + (1 / i);
        System.out.println("Toto je môj výsledok: "+summary+"   .........ale snažím sa" +
                "aj o nejaký postup na báze sčítania zlomkov. " +
                "Ale už na 20. čísle mi to počíta aspoň 30 sekúnd... :D " +
                "OKAY po 5 minútach spraví len 25 zlomkov :D" +
                "No skúšal som to len pri prvých desiatich a jak hodinky presne");
        System.out.println();


        long citatel = 1;
        long menovatel = 1;
        long nextMenovatel = 2;
        long nextCitatel = 1;
        int darina = 1;
        long finallresult;
        int zlozenyZlomok = 0;
        while (darina<101){
            System.out.print(darina +".  "+ zlozenyZlomok+" " + citatel+"/"+menovatel+ "     " );


            // sum two fractions
            long help = menovatel;
             menovatel = menovatel*nextMenovatel;
             citatel = citatel * nextMenovatel;
             nextCitatel = nextCitatel*help;
             citatel = citatel + nextCitatel;

            // reduce current fraction
            long big = Math.max(citatel, menovatel);  // toto je TERNARNY OPERATOR
            for (long i = big; i>=1; i-- ){
                if (citatel%i == 0 && menovatel%i == 0){
                    citatel /= i;
                    menovatel /= i;
                }
            }
            // myslel som že cez zložený zlomok budu menšie zlomky a až na konci ich vynásobím no
            // bohužiaľ rovnako dlho to robí :D
            zlozenyZlomok = zlozenyZlomok + (int) ((int) citatel/menovatel);
            citatel = citatel%menovatel;


            darina++;
            nextMenovatel++;
            nextCitatel = 1;
        }
        finallresult = ((menovatel*zlozenyZlomok) + citatel) / menovatel;
        System.out.println("FINALLY: " + finallresult);

    }
}

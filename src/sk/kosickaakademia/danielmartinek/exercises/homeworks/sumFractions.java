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
        System.out.println(summary);


        // toto je už Kristiánov kód.. :D má tam premennú navyše :P ale výsledky máme rovnaké
        double myNum = 0;
        double sum = 0;
        for (var i = 1; i<=100; i++){
            myNum = (double)1/i;
            sum -= -myNum;
        }
        System.out.println(sum);

    }
}

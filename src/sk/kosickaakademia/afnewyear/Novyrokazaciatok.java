package sk.kosickaakademia.afnewyear;

public class Novyrokazaciatok {
    public static void main(String[] args) {
        System.out.println(numberWithTheMostOfDivisors(1000)); //840 s 32 delitelmi
    }


    public static int numberWithTheMostOfDivisors(int tisic) {
        int divisors = 0;
        int maxdivisors = 0;
        int maxnumber = 1;

        for (int n = 500; n <= tisic; n+=1) {
            if (maxdivisors<divisors) maxdivisors = divisors;
            divisors = 0;

            for (int i = 1; i <= n; i++)
                if (n % i == 0) {
                    divisors++;
                    if (divisors > maxdivisors) maxnumber = i;
                }
        }
        return maxnumber;
    }
}

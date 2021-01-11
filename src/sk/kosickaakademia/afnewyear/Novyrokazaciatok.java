package sk.kosickaakademia.afnewyear;

public class Novyrokazaciatok {
    public static void main(String[] args) {
      //  System.out.println(numberWithTheMostOfDivisors(1000)); //840 s 32 delitelmi

        String balast = "BBALASTBALASTRBALASTABALASTBALASTBALASTTBALASTBALASTIBALASTBALASTBALASTSLBALASTBALASTBALASTABALASTBALASTVBALASTBALASTA\n";
        String balast2 = "BALASTBBABALASTLASTALASBALASTBALBALASTASTTSBALASTTABILIBALASTBALASTTABALASBALASTT\n";
        System.out.println(balast.replaceAll("BALAST",""));

         balast2 = balast2.replaceAll("BALAST","");
         balast2 = balast2.replaceAll("BALAST","");
         balast2 = balast2.replaceAll("BALAST","");

       /* while (balast2.contains("_")==true){
            balast2=balast2.replaceAll("______","");
         //   boolean isFound = balast2.indexOf("BALAST") !=-1? true: false;
         //   if (isFound == true){
                balast2 = balast2.replaceAll("BALAST","______");
                System.out.println(balast2.replaceAll("BALAST","______"));
         //   }
        }
         */
        System.out.println(balast2);

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

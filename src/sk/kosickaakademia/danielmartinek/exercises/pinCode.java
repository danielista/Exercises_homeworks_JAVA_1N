package sk.kosickaakademia.danielmartinek.exercises;

public class pinCode {

        public static void main(String[] args) {
            // neparne číslo + nieje delitelne 3 + je delitelne 113 + žiadne cifry sa neopakuju
            // chceme všetky štvorciferne čísla (kombinations)
            // saadsa

            System.out.print("PINKOD GENERATOR:  ");
            int i = 113;
            int a,b,c,d;
            while( i < 10000){
                if ( (i%3 != 0) && (i%113 == 0) ) {

                    a= i%10;
                    b= (i/10) %10;
                    c= (i/100) %10;
                    d= (i/1000) %10;
                    if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
                        if (i<1000) {
                            System.out.print(" 0" + i );
                        }else System.out.print(" " + i);
                }
                i += 2;

            }


        }
    }



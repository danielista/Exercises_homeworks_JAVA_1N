package sk.kosickaakademia.danielmartinek.exercises;
import java.util.Scanner;

/*
    GAME Guess my number:
    - interactive game with inputs and hints
    - added attempts counting
    - added MAX attempts
 */

public class myRANDOM {
    public static void main(String[] args) {
      int max = 80;
      guessNumber(max);
    }

    public static void guessNumber (int max){
        int randomNUMBER = (int)(Math.random()*max + 1);
        Scanner skenerik = new Scanner(System.in);
        int guess;
        int attempt = 1;
        int maxAttempt = 5;

        System.out.println("Zadaj čislo kámo, a pokús sa uhádnuť moje číslo (0-" +max+ "): ");
        System.out.println("Máš len " + maxAttempt + " pokusov. Tak sa snaž ;) ");

        do {
            guess=skenerik.nextInt();
            if(guess==randomNUMBER){
                System.out.println("CONGRATULATIONS UHADOL SI HÁDANÉ ČÍSLO ;)  podarilo sa Ti to na " + attempt + " pokus.");
                break;
            }else if(attempt > maxAttempt-1) {
                System.out.println("GAME OVER It is NOT even " + guess + " Presiahol si daný počet pokusov. try again later");
                break;
            }else if (guess <= randomNUMBER){
                System.out.print("Hint: skús vyššie číslo");
                attempt++;
            }else if(guess >= randomNUMBER){
                System.out.print("Hint: skús menšie číslo");
                attempt++;
            }
            System.out.print("     ------> attempt number: " + attempt + "    ");
        }while(guess != randomNUMBER);
    }

}


/*
┈┈╱▔▔▔▔▔╲┈┈┈HM┈HM
┈╱┈┈╱▔╲╲╲▏┈┈┈HMMM
╱┈┈╱━╱▔▔▔▔▔╲━╮┈┈
▏┈▕┃▕╱▔╲╱▔╲▕╮┃┈┈
▏┈▕╰━▏▊▕▕▋▕▕━╯┈┈
╲┈┈╲╱▔╭╮▔▔┳╲╲┈┈┈
┈╲┈┈▏╭━━━━╯▕▕┈┈┈
┈┈╲┈╲▂▂▂▂▂▂╱╱┈┈┈
┈┈┈┈▏┊┈┈┈┈┊┈┈┈╲┈
┈┈┈┈▏┊┈┈┈┈┊▕╲┈┈╲
┈╱▔╲▏┊┈┈┈┈┊▕╱▔╲▕
┈▏ ┈┈┈╰┈┈┈┈╯┈┈┈▕▕
┈╲┈┈┈╲┈┈┈┈╱┈┈┈╱┈╲
┈┈╲┈┈▕▔▔▔▔▏┈┈╱╲╲╲▏
┈╱▔┈┈▕┈┈┈┈▏┈┈▔╲▔▔
┈╲▂▂▂╱┈┈┈┈╲▂▂▂╱┈

 */
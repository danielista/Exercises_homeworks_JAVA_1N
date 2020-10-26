package sk.kosickaakademia.danielmartinek.exercises.loteria;

/*
██╗      ██████╗ ████████╗████████╗███████╗██████╗ ██╗   ██╗
██║     ██╔═══██╗╚══██╔══╝╚══██╔══╝██╔════╝██╔══██╗╚██╗ ██╔╝
██║     ██║   ██║   ██║      ██║   █████╗  ██████╔╝ ╚████╔╝
██║     ██║   ██║   ██║      ██║   ██╔══╝  ██╔══██╗  ╚██╔╝
███████╗╚██████╔╝   ██║      ██║   ███████╗██║  ██║   ██║
╚══════╝ ╚═════╝    ╚═╝      ╚═╝   ╚══════╝╚═╝  ╚═╝   ╚═╝
                                                             */
import java.util.Scanner;
public class Loteria {

    private int[] tip = new int[5];
    private int[] zreb = new int[10];
    private int wins=0;
    private int[] winningNumbers = new int[5];
    private double bet;

    public static void main(String[] args) {
        System.out.println("\033[31;1m$$ WELCOME IN A Lott\033[32;1;2merry $$\033[0m");
        Loteria loteria = new Loteria();


        // zadavanie stávky
        loteria.enteringBet();

        // tipovanie 5-tich čísel a ich výpis a aj kontrola
        loteria.inputNumbers();
        // žrebovanie 10 čísel a ich výpis
        loteria.drawNumbers();
        // kontrola počtu uhádnutých a ich výpis
        loteria.checkWinningNumbers();

        // cashier banka vypočíta výhru :_D
        loteria.cashWin(loteria.wins);

    }


    private void enteringBet() {
        do{ System.out.println("Please enter your BET");
            Scanner sc = new Scanner(System.in);
            bet = sc.nextDouble();
        } while ( bet<0 || bet == 0);
    }



    public void cashWin(int howManyWins){
        double howMany = switch (howManyWins) {
            case 1, 0 -> 0;
            case 2 -> 2 * bet;
            case 3 -> 15 * bet;
            case 4 -> 500 * bet;
            case 5 -> 10000 * bet;
            default -> 0;
        };
        if (howManyWins>1)
        System.out.println("You WON " + howMany + " $ [american dollars]");
        else System.out.println("You won NOTHING bro... just try again ;$");
    }



    public void checkWinningNumbers(){
        for (int i = 0; i < 5; i++) {
            for (int j=0; j<10; j++)
                if (zreb[j] == tip[i] ){
                    wins++;
                    winningNumbers[i]=zreb[j];
            }
        }
        System.out.print("Congratulation you won "+wins+ " numbers.");
        System.out.print("The numbers were: ");
        if (winningNumbers == null) {
            System.out.println("no bohužiaľ, žiadne si neuhádol skús znova :D");
        }
        for (int i = 0; i < 5; i++) {
            if (winningNumbers[i] != 0 )
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println();
    }



    public void drawNumbers (){
        System.out.println( " ");
        System.out.println("V hre KENO 10 boli vyžrebované tieto čísla: ");
               for (int i = 0; i < 10; i++) {
                zreb[i] = (int) (Math.random() * 20 + 1);

                // checking the repeatable values, and their replacement
                int j = 0;
                while (j < i) {
                    if (zreb[i] == zreb[j]) {
                        zreb[i] = (int) (Math.random() * 20 + 1);
                        continue;
                    }
                    j++;
                }
                System.out.print(zreb[i] + "   ");
            }
            System.out.println( );
    }



    public void inputNumbers(){
        int i=0;
        int in;
        Scanner sc = new Scanner(System.in);
        while (i<5){
            System.out.print("Enter "+ (i+1)+". number: ");
            in = sc.nextInt();
            if(in>0 && in<21 && checkArray(i,in)){
                tip[i]=in;
                i++;
            }
            else
                System.out.println("wrong input.. try again");
        }
        System.out.println("Your tips: ");
        for(i=0; i<5; i++){
            System.out.print(tip[i]+ " ");
        }
    }

    public boolean checkArray(int i, int in){
        if (i==0)
            return true;
        if (i==1){
            for (int j=0; j<i; j++){
                if(tip[j]==in )
                    return false;
            }
        }return true;
    }

}

package sk.kosickaakademia.danielmartinek.exercises.dvojrozmernepolia;

import java.util.Random;
import java.util.Scanner;

 /*   ___         ___         ___         \ /
       |  o  _     |  _  _     |  _  _     X
       |  | (_     | (_|(_     | (_)(/_   / \

       PIŠKVORKY 5x5 by Daniel Martinek :D  */

public class TicTacToeX {

    private static int[][] board = new int[5][5];
    private static int[][] navigation = new int[5][5];
    private static int winner = -1;
    private static Scanner skenerik = new Scanner(System.in);
    public static int player = 0;

    public static void main(String[] args) {

        board = createBoard();
        printBoard();
        player = 1;

        do{
            if (player==4)player=1;
            moveofPlayer();
            checkWinner();

        }while(winner == -1);
        System.out.println("---------------------------------------------------");
        if(winner>0) System.out.println("Congratulation, WINNER IS PLAYER ((("+ winner +")))");
        else System.out.println("IT IS DRAAAAAAAW");
    }

    private static void checkWinner() {

        //checking  the End of the game
        int endOfGame=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(navigation[i][j] != 0){
                    break;
                }else endOfGame=endOfGame+1;
            }
        }
        if (endOfGame==25) winner=0;

        if(checkWinningtile()==1){winner = 1; }
        else if (checkWinningtile()==2)winner = 2;
        else if (checkWinningtile()==3)winner = 3;
    }


    // one Turn of current player plus increasing player
    private static void moveofPlayer(){
        int input1;
        int end = -1;
        do{
            System.out.print("[Player ("+player+")]: Please type a number of empty field: ");
            input1 = skenerik.nextInt();
            orientation(input1);
        }while(end != orientation(input1));
        player = player + 1;
        printBoard();
    }


    // VERIFY input and set player on the current field
    private static int orientation(int input1) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(navigation[i][j] == input1 && board[i][j] == 0){
                    board[i][j] = player;
                    navigation[i][j]=0;
                }//else end=-1;
            }
        }
        return -1;
    }

    private static int checkWinningtile() {
        int result=0;


        // checking HORIZONTAL tiles and one diagonale (\)
        int sum1horizontale = 0;
        int sum1diagonale =0;
        int sum2horizontale = 0;
        int sum2diagonale =0;
        int sum3horizontale = 0;
        int sum3diagonale =0;
        for (int i = 0; i < board.length; i++) {
            //jednotky diagonalne (\)
            if (board[i][i] == 1) sum1diagonale = sum1diagonale + 1;
            if (sum1diagonale == 5){
                result=1;
                break;
            }
            // dvojky diagonalne (\)
            if (board[i][i] == 2) sum2diagonale = sum2diagonale + 2;
            if (sum2diagonale == 10){
                result=2;
                break;
            }
            // trojky diagonalne (\)
            if (board[i][i] == 3) sum3diagonale = sum3diagonale + 3;
            if (sum3diagonale == 15){
                result=3;
                break;
            }

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) sum1horizontale = sum1horizontale + 1;
                if (sum1horizontale == 5){
                    result=1;
                    break;
                }
                //dvojky horizontalne
                if (board[i][j] == 2) sum2horizontale = sum2horizontale + 2;
                if (sum2horizontale == 10){
                    result=2;
                    break;
                }
                //trojky horizontalne
                if (board[i][j] == 3) sum3horizontale = sum3horizontale + 3;
                if (sum3horizontale == 15){
                    result=3;
                    break;
                }
            }
            sum1horizontale=0; sum2horizontale=0; sum3horizontale=0;
        }

        // checking VERTICAL and one diagonale (/) tiles
        int sum1verticale = 0;
        sum1diagonale =0;
        int sum2verticale = 0;
        sum2diagonale =0;
        int sum3verticale = 0;
        sum3diagonale =0;
        for (int i = board.length-1; i >= 0; i--) {
            if (board[i][i] == 1) sum1diagonale = sum1diagonale + 1;
            if (sum1diagonale == 5){
                result=1;
                break;
            }
            // dvojky diagonalne(/)
            if (board[i][i] == 2) sum2diagonale = sum2diagonale + 2;
            if (sum2diagonale == 10){
                result=2;
                break;
            }
            //trojky diagonalne (/)
            if (board[i][i] == 3) sum3diagonale = sum3diagonale + 3;
            if (sum3diagonale == 15){
                result=3;
                break;
            }
            for (int j = board[i].length-1; j >= 0; j--) {
                if (board[i][j] == 1) sum1verticale = sum1verticale + 1;
                if (sum1verticale == 5){
                    result=1;
                    break;
                }
                // dvojky vertikálne
                if (board[i][j] == 2) sum2verticale = sum2verticale + 2;
                if (sum2verticale == 10){
                    result=2;
                    break;
                }
                // trojky vertikalne
                if (board[i][j] == 3) sum3verticale = sum3verticale + 3;
                if (sum3verticale == 15){
                    result=3;
                    break;
                }
            }
            sum1verticale=0;sum2verticale=0;sum3verticale=0;
        }

        return result;
    }


        // just print the current board 5x5 and short navigation
        public static void printBoard(){
            int row = board.length;
            int col = board[0].length;
            int f =1; int g=5;
            System.out.println("------PLAY-BOARD---------------NAVIGATION BOARD-------------->");
            for (int i = 0; i < row; i++) {
                System.out.print(" | ");
                for (int j = 0; j < col; j++) {
                    System.out.print(board[i][j] + " | ");
                }

                System.out.print("    ");
                for (int j = 0; j < col; j++) {

                    if (navigation[i][j]<10){
                        System.out.print(" |  " + navigation[i][j]  );
                    }else System.out.print(" | " + navigation[i][j]  );
                }
                System.out.print("    --> "+f+"-"+g + "   ");
                f += 5;
                g += 5;

                System.out.println();


            }

        }


        // create board 5x5 full of "0" and also navigation
        public static int[][] createBoard () {
        int order=0;
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        Random rnd = new Random();
                        board[i][j] = 0;
                        //board[i][j] = rnd.nextInt(2);
                        navigation[i][j] = order+1;
                        order++;
                    }
                }
            return board;
        }


}




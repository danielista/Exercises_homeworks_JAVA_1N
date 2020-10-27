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
    public static void main(String[] args) {



        board = createBoard();
        printBoard();


        do{
            moveofPlayer1();
            checkWinner();

        }while(winner == -1);
        System.out.println("---------------------------------------------------");
        System.out.println("Congratulation, WINNER IS PLAYER ((("+ winner +")))");
    }

    private static void checkWinner() {
        if(checkWinningtile()==1){

            winner = 1;
        }//else System.out.println("IT IS DRAAAAAAAW");
    }


    private static void moveofPlayer1(){
        int input1;
        int end = -1;
        do{
            System.out.print("[Player (1)]: Please type a number of empty field: ");
            input1 = skenerik.nextInt();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if(navigation[i][j] == input1 && board[i][j] == 0){
                         board[i][j] = 1;
                         navigation[i][j]=0;
                    }else end=-1;
                }
            }
        }while(end != -1);

        orientation(input1);
        printBoard();

    }

    private static void orientation(int input) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(navigation[i][j] == input)
                board[i][j] = 1;

            }
        }
    }

    private static int checkWinningtile() {
        int result=0;


        // checking HORIZONTAL tiles and one diagonale (\)
        int sum1horizontale = 0;
        int sum1diagonale =0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) sum1diagonale = sum1diagonale + 1;
            if (sum1diagonale == 5){
                result=1;
                break;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) sum1horizontale = sum1horizontale + 1;
                if (sum1horizontale == 5){
                    result=1;
                    break;
                }
            }
            sum1horizontale=0;
        }

        // checking VERTICAL and one diagonale (/) tiles
        int sum1verticale = 0;
        sum1diagonale =0;
        for (int i = board.length-1; i >= 0; i--) {
            if (board[i][i] == 1) sum1diagonale = sum1diagonale + 1;
            if (sum1diagonale == 5){
                result=1;
                break;
            }
            for (int j = board[i].length-1; j >= 0; j--) {
                if (board[i][j] == 1) sum1verticale = sum1verticale + 1;
                if (sum1verticale == 5){
                    result=1;
                    break;
                }
            }
            sum1verticale=0;
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




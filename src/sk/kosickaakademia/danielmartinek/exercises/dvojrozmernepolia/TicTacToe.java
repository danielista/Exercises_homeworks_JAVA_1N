package sk.kosickaakademia.danielmartinek.exercises.dvojrozmernepolia;

import java.util.Scanner;

public class TicTacToe {
    private int[][] pole;
    private int player=1;
    private int count=0;

    public TicTacToe() {
        pole=new int[3][3];
        initArray();
    }

    private void initArray() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                pole[i][j]=0;
    }

    public int isWinner(){  // return 0 or 1 or 2
        int i;
        for(i=0;i<3;i++ ){
            if(pole[i][0]*pole[i][1]*pole[i][2]==1 || pole[0][i]*pole[1][i]*pole[2][i]==1)
                return 1;
            if(pole[i][0]*pole[i][1]*pole[i][2]==8 || pole[0][i]*pole[1][i]*pole[2][i]==8)
                return 2;
        }
        if(pole[0][0]*pole[1][1]*pole[2][2]==1 || pole[0][2]*pole[1][1]*pole[2][0]==1)
            return 1;
        if(pole[0][0]*pole[1][1]*pole[2][2]==8 || pole[0][2]*pole[1][1]*pole[2][0]==8)
            return 2;
        return 0;
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        int input;
        while(isWinner()==0){
            System.out.println("Player "+player);
            input=sc.nextInt();
            if(input<1 || input>9) {
                System.out.println("Input must be between 1 and 9");
                continue;
            }
            int r=(input-1)/3;
            int c=(input-1)%3;
            if(pole[r][c]!=0) {
                System.out.println("Tile you chosed is not empty");
                continue;
            }
            pole[r][c]=player;
            printGame();
            count++;
            if(count==9){
                break;
            }
            nextPlayer();
        }

        if(isWinner()==1){
            System.out.println("Player 1 is winner");
        }
        else if(isWinner()==2){
            System.out.println("Player 2 is winner");
        }else{
            System.out.println("Cat");
        }
    }

    private void printGame() {
        System.out.println("- - -");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("- - -");
    }

    private void nextPlayer() {
        if(player==1)
            player=2;
        else
            player=1;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}
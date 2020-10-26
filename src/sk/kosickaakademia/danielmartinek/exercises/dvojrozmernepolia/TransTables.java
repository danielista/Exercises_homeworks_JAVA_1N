package sk.kosickaakademia.danielmartinek.exercises.dvojrozmernepolia;

import java.util.Random;

public class TransTables {

    public static void main(String[] args) {
        int[][] poleXX= new int[][]{ {2,5,8,0},{13,21,37,49},{-9,1,8,14}};
        TransTables t = new TransTables();
        changeArray(poleXX);


        /*
 ██████╗██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███████╗ █████╗ ██████╗ ██████╗  █████╗ ██╗   ██╗
██╔════╝██║  ██║██╔══██╗████╗  ██║██╔════╝ ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝
██║     ███████║███████║██╔██╗ ██║██║  ███╗█████╗  ███████║██████╔╝██████╔╝███████║ ╚████╔╝
██║     ██╔══██║██╔══██║██║╚██╗██║██║   ██║██╔══╝  ██╔══██║██╔══██╗██╔══██╗██╔══██║  ╚██╔╝
╚██████╗██║  ██║██║  ██║██║ ╚████║╚██████╔╝███████╗██║  ██║██║  ██║██║  ██║██║  ██║   ██║
 ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝

        * */
    }


    public static void changeArray(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                int num = arr[i][j];
                if (num < 0){
                    num = firstOption(num);
                }
                else if (num > 0 && num%2!=0){
                    num = secondOption(num);
                }
                else{
                    num = thirdOption(num);
                }
                arr[i][j] = num;
                if (arr[i][j] <0 || arr[i][j] >9){
                    System.out.print(arr[i][j] + " |  ");
                }else System.out.print(arr[i][j] + "  |  ");
                //System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
        // absolute value
    public static int firstOption(int num){
        num = -num;
        return num;
    }

    public static int secondOption(int num){
        int sameNum = num;
        int find = sameNum/10;
        if (num>10)
            num = (find%2==0)?num-1:num+1;
        return num;
    }

    public static int thirdOption(int num){
        Random rnd = new Random();
        if (num == 0){
            num = (int) (rnd.nextInt(90)+10);
        }
        return num;
    }

}

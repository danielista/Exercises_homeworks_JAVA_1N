package sk.kosickaakademia.daniel.martinek.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int help;


        for (int i=0; i< array.length-1;i++){
            for (int j=0; j< array.length-1-i; j++){
                // swap
                if (array[j] > array[j+1]){
                    help = array[j+1];
                    array[j+1] = array[j];
                    array[j] = help;
                }
            }

        }

        for (int i=0; i< array.length-1;i++){
            System.out.print(array[i] + " ");
        }

    }
}

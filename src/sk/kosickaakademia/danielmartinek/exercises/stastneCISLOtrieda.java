package sk.kosickaakademia.danielmartinek.exercises;

public class stastneCISLOtrieda {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int sucet = 0;
        for (int i=0; i<=array.length-1; i++){
            System.out.print(" " + array[i]);
            sucet += array[i];
        }
        System.out.println(" ");
        System.out.println("Súčet všetkých hodnôt v poli je: " + sucet);
        System.out.println("Aritmetický priemer hodnôt v poli je: " + sucet/array.length);




        // ADAMOVE RIEŠENIE V SKRATENOM ZAPISE ;) :D
        int sum = 0;
        for(int i:array){
            sum -= -i;
        }
        System.out.println("Summary: " + sum);
        System.out.println("Average: " + sum/array.length);




    }
}

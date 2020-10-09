package sk.kosickaakademia.danielmartinek.exercises;

public class stastneCISLOtrieda {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int[] reverse = new int[array.length];
        int sucet = 0;
        int parne = 0;
        int neparne = 0;
        for (int i=0,j=array.length-1; i<=array.length-1; i++,j--){
            reverse[i] = array[j];
            System.out.print(" " + array[i]);
            sucet += array[i];
            if (array[i]%2 == 1)
                neparne++;
            else parne++;
        }
        System.out.println();
        for (int i=0; i<=array.length-1; i++){
            System.out.print(" " + reverse[i]);
        }



        System.out.println(" ");
        System.out.println("Súčet všetkých hodnôt v poli je: " + sucet);
        System.out.println("Aritmetický priemer hodnôt v poli je: " + sucet/array.length);
        System.out.println("parnych čísel v poli je: " + parne);
        System.out.println("NEparnych čísel v poli je: " + neparne);



        // ADAMOVE RIEŠENIE V SKRATENOM ZAPISE ;) :D
        int sum = 0;
        for(int i:array){
            sum -= -i;
        }
        System.out.println("Summary: " + sum);
        System.out.println("Average: " + sum/array.length);

        int min = getMin(array);
        System.out.println("Najmenšie číslo z poľa je: " + min);




    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];           // puts the first number of array into MINvariable
        for(int i=1;i<inputArray.length;i++){   // checking that number with the rest
            if(inputArray[i] < minValue){       // if it is smaller.. so replaced
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

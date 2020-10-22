package sk.kosickaakademia.danielmartinek.exercises.dvojrozmernepolia;
/*
 2  5  8  0
 0  1  7  9
-9  1  8  14
 */
public class Uvod {
    private int[][] arr = new int[][]{{2, 5, 8, 0}, {0, 1, 7, 9}, {-9, 1, 8, 14}};

    public static void main(String[] args) {
        Uvod t = new Uvod();
        int value = t.min();
        System.out.println("Min value is " + value);

        value = t.max();
        System.out.println("Max value is " + value);

        double avg = t.avg();
        System.out.println("Avg of values is " + avg);

        value = t.sumUnderDiagonale();
        System.out.println("Diagonale sum is: " + value);
    }


    // minimum of array
    public int min() {
        int minimum = arr[0][0];
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                /*if(arr[i][j]<minimum)
                    minimum=arr[i][j];*/
                minimum = arr[i][j] < minimum ? arr[i][j] : minimum;
            }
        }
        return minimum;
    }


    // maximum value of array
    public int max() {
        int maxi = arr[0][0];
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                maxi = arr[i][j] > maxi ? arr[i][j] : maxi;
            }
        }
        return maxi;
    }


    // average of array values
    public double avg() {
        int sum = 0;
        double avg = 0;  // avg použijem aj na počítanie všetkých členov

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
                avg++;
            }
        }
        avg = sum / avg;
        return avg;
    }


    // sum of values in array diagonale
    public int sumUnderDiagonale() { // row>col
        int sumDiagonale=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //  maxi = arr[i][j] > maxi ? arr[i][j] : maxi;
                if(i==j)sumDiagonale += arr[i][j];
            }
        }

        return sumDiagonale;
    }

}
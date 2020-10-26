package sk.kosickaakademia.danielmartinek.exercises.homeworks;
/*
  _  ________ _   _  ____    ___   ___
 | |/ /  ____| \ | |/ __ \  |__ \ / _ \
 | ' /| |__  |  \| | |  | |    ) | | | |
 |  < |  __| | . ` | |  | |   / /| | | |
 | . \| |____| |\  | |__| |  / /_| |_| |
 |_|\_\______|_| \_|\____/  |____|\___/
 */
public class bonusKENO10 {
    public static void main(String[] args) {
        int[] keno = new int[20];
        System.out.println("V hre KENO 20 boli vyžrebované tieto čísla: ");
       int o = 0;
        while (o<100) {
            for (int i = 0; i < 20; i++) {
                keno[i] = (int) (Math.random() * 80 + 1);

                // checking the repeatable values, and their replacement
                int j = 0;
                while (j < i) {
                    if (keno[i] == keno[j]) {
                        keno[i] = (int) (Math.random() * 80 + 1);
                        continue;
                    }
                    j++;
                }
                System.out.print(keno[i] + "   ");
            }
            System.out.println( );
            o++;
        }
    }
}

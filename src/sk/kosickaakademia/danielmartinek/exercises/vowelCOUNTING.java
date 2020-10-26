package sk.kosickaakademia.danielmartinek.exercises;

// spočíta samohlasky + overi či je číslo z danej sustavy
//

import java.util.Scanner;

public class vowelCOUNTING {
    public static void main(String[] args) {


        String text = "8X75Y2";
        int x = 0;
        int y = 0;
        while (x <= 9) {
            int num = 0;
            for (int j = 0; j < text.length(); j++) {
                char z = text.charAt(j);
                if (z<=57 && z>=49){
                    num -= -((z-'0') * (int) Math.pow(10,(text.length()-j-1)));
                }
                if (z == 'X'){
                    num -= -(x)* (int) Math.pow(10, (text.length()-j-1));
                }
                if (z == 'Y'){
                    num -= -(y)* (int) Math.pow(10, (text.length()-j-1));
                }
            }
            if (num%2==0){
                System.out.println(num);
            }
            if (y==9){
                y = 0;
                x -= -1;
            }
            y -= -1;
        }



















        String data =" Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods. " ;
        int len = data.length();
        int vowelSUMMARY = 0;
        data = data.toLowerCase();
        for (int i = 0; len > i; i++){
            char z=data.charAt(i);
            if (z == 'a' || z=='e' || z=='i' || z=='o' || z=='u' || z=='y'){
                vowelSUMMARY++;
            }
        }
        System.out.println(vowelSUMMARY);


        Scanner skenerik = new Scanner(System.in);
        System.out.println("Pleaase enter the number: ");
        String number = skenerik.next();
        isHexa(number);

    }


    public static Boolean isHexa (String number){
        boolean is = true;
        number = number.toLowerCase();
        int len = number.length();
        for (int i = 0; len > i; i++){
            char z = number.charAt(i);
            if (z != 'a' && z != 'b' && z != 'c' && z != 'd' && z != 'e' && z != 'f' && z!= '0' && z != '1' && z != '2' && z != '3' && z != '4' && z != '5' && z != '6' && z != '7' && z != '8'&& z != '9') {
                is = false;
                break;
            }
        }
        if (is==true) System.out.println("číslo je hexadecimalne");
        return is;
    }

    public static Boolean isOctal (String number){
        boolean is = true;
        number = number.toLowerCase();
        int len = number.length();
        for (int i = 0; len > i; i++){
            char z = number.charAt(i);
            if (z!= '0' && z != '1' && z != '2' && z != '3' && z != '4' && z != '5' && z != '6' && z != '7') {
                is = false;
                break;
            }
        }
        return is;
    }

    public static boolean isBinary (String number){
        boolean is = true;
        number = number.toLowerCase();
        int len = number.length();
        for (int i = 0; len > i; i++){
            char z = number.charAt(i);
            if (z!= '0' && z != '1') {
                is = false;
                break;
            }
        }
        return is;
    }

}

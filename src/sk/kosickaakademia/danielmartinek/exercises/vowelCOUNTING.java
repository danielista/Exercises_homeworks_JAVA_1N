package sk.kosickaakademia.danielmartinek.exercises;

public class vowelCOUNTING {
    public static void main(String[] args) {
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


    }
}

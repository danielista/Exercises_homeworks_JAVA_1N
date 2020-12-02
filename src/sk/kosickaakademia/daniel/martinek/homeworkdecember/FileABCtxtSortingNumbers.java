package sk.kosickaakademia.daniel.martinek.homeworkdecember;
// domáca úloha
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileABCtxtSortingNumbers {
    public static void main(String[] args) {
        copyNumbersFromFilesToArrays("resource/a.txt", "resource/b.txt");
    }

    // input two files with numbers
    // output is file c.txt which contains all that numbers without repeating
    // numbers will be sorted,arranged starting by biggest number
    public static void copyNumbersFromFilesToArrays(String fileNameA, String fileNameB){

        try{
            if(!new File(fileNameA).exists()){
                System.out.println("problem: file "+ fileNameA + " does not exist!!");
                return;
            }if(!new File(fileNameB).exists()){
                System.out.println("problem: file "+ fileNameB + " does not exist!!");
                return;
            }

            // list integersA contains all numbers from a.txt
            File file = new File(fileNameA);
            Scanner scanner = new Scanner(file);
            List<Integer> integersA = new ArrayList<>();
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    integersA.add(scanner.nextInt());
                }
                else {
                    scanner.next();
                }
            }


            // list integersB contains all numbers from B.txt
            File fileB = new File(fileNameB);
            Scanner scannerB = new Scanner(fileB);
            List<Integer> integersB = new ArrayList<>();
            while (scannerB.hasNext()) {
                if (scannerB.hasNextInt()) {
                    integersB.add(scannerB.nextInt());
                }
                else {
                    scannerB.next();
                }
            }

            // a.txt numbers -> sorting and deleting duplicities
            Collections.sort(integersA);
            integersA.removeAll(integersB);
            System.out.println("NUMBERS from A.txt which are not in B.txt: " + integersA);

            // b.txt numbers -> sorting and deleting duplicities
            Collections.sort(integersB);
            integersB.removeAll(integersA);
            System.out.println("NUMBERS from B.txt which are not in A.txt: " + integersB);

            // new c.txt with merged lists of numbers from previous files without duplicities
            PrintWriter writer = new PrintWriter("outputs/c.txt", StandardCharsets.UTF_8);
            integersA.addAll(integersB);    //Merge both lists
            Collections.reverse(integersA);  // zoradene su už len prevratiť potrebujem
            writer.print(integersA);
            writer.close();

            System.out.println("C.txt numbers SORTED STARTING THE biggest: "+integersA);//already merged a+b without duplicities


        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
/*
┬ ┬┌─┐┌┬┐┌─┐┬ ┬┌─┐┬─┐┬┌─
├─┤│ ││││├┤ ││││ │├┬┘├┴┐   is DONE
┴ ┴└─┘┴ ┴└─┘└┴┘└─┘┴└─┴ ┴
 */
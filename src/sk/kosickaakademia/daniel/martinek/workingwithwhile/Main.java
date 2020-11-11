package sk.kosickaakademia.daniel.martinek.workingwithwhile;


public class Main {

    public static void main(String[] args) {
            RWFile rwFile = new RWFile();
            rwFile.copyFileWithCapital("resource/a.txt");
            rwFile.copyAndEncryptFile("resource/a.txt",287); // subor C_čas.txt (caesarova šifra)

            rwFile.makeDiktat("resource/a.txt"); // diktát




    }
}

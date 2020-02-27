package Uebung1;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Das Problem ist hier, das eventuell keine Datei erstellt werden kann aufgrunddessen muss das ganze in einen try
 * catch es kann bei bedarf ein finalize eingefuegt werden in dem der writer geschlossen wird. Der muss aber wieder in
 * ein try catch.
 */



public class Main {
    public static void main(String[] args) {
        FileWriter datei;
        String text;
        text ="1/n";
        //this is my second test
        //this is my test



        try {
            datei = new FileWriter("ausgabe.txt");
            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";

            }
            datei.write(text, 0, text.length());
            datei.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

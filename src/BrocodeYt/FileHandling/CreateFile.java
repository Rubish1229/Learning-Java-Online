package BrocodeYt.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        String path = "/Users/rubishkarmacharya/Desktop/new.txt";
        String text = "I like pizza while coding";

        try (FileWriter writer = new FileWriter(path)) {
                writer.write(text);
            System.out.println("text written successfully !");
        } catch (IOException e) {
            System.out.println("File not found" + e);
        }
        finally {
            System.out.println("Exiting !");
        }
    }
}

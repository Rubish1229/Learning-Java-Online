package BrocodeYt.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
        String filePath = "/Users/rubishkarmacharya/Desktop/new.txt";

        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (IOException ex){
            System.out.println("File not found "+ ex);
        }

    }
}

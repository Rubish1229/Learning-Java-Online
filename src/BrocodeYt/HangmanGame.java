package BrocodeYt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        int wrongGusses = 0;


        String filePath="src/BrocodeYt/HangManGameWordsCollection.txt";
        ArrayList<String> words=new ArrayList<>();

        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                words.add(line.trim());
            }
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
        Random random=new Random();
        String word= words.get(random.nextInt(words.size()));


        Scanner sc = new Scanner(System.in);
        ArrayList<Character> placeholder = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            placeholder.add('_');
        }
        ArrayList<Character> gussesLetters=new ArrayList<>();
        while (wrongGusses < 6) {

            System.out.println("---- Welcome to HangMan game ----");
            System.out.println(placeholder);

            System.out.println("Enter your guess : ");
            char userInput = sc.next().toLowerCase().charAt(0);
            if(gussesLetters.contains(userInput)){
                System.out.println("You already guessed that letter!");
                continue;
            }
            if (word.indexOf(userInput) >= 0) {
                System.out.println("WOW ! Correct guess...");
                System.out.println("The guessed word was : " + userInput);
                for (int i = 0; i < word.length(); i++) {

                    if (word.charAt(i) == userInput) {
                        placeholder.set(i, userInput);
                    }
                }
                System.out.println(placeholder);
                if (!placeholder.contains('_')) {
                    System.out.println("Hurray! You won the game !");
                    System.out.println("The correct word was : " + word);
                    break;

                }

            } else {
                wrongGusses++;
                System.out.println("Ooops ! Incorrect guess word : " + userInput);

            }



            System.out.println(gameModel(wrongGusses));
        }
        if(wrongGusses>=6){
            System.out.println("Game over. You lost!");
            System.out.println("The word was : "+word);
        }
    }

    static String gameModel(int numOfWrongGuess){
        return switch (numOfWrongGuess) {
            case 0 -> """
                    
                    
                    
                      """;

            case 1 -> """
                       *
                       O
                    
                      """;

            case 2 -> """
                       *
                       O
                       |
                      
                      """;
            case 3 -> """
                       *
                       O
                      /|
                       
                      """;
            case 4 -> """
                       *
                       O
                      /|\\
                       
                     
                      """;
            case 5 -> """
                       *
                       O
                      /|\\
                      /
                     
                      """;
            case 6 -> """
                       *
                       O
                      /|\\
                      / \\ 
                     
                      """;
            default -> "";
        };

    }
}

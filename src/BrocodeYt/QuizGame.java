package BrocodeYt;

import java.util.Arrays;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        int count=0;
        int score=0;
        char ans;
        String[] questions={"1. What does CPU stand for?",
                "2.Which language is mainly used for Android app development?",
                "3. Which data structure works on FIFO (First In First Out)?"};

        String[][] options={{"A. Central Program Unit","B. Central Processing Unit","C. Computer Processing Unit","D. Control Processing Unit"},
                {"A. Python","B. C","C. Java","D. HTML"},
                {"A. Stack","B. Queue","C. Tree","D. Array"}
                };

        char[] answers = {'B', 'C', 'B'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to quiz game");

        for(int i=0;i< questions.length;i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("Enter you answer : ");
            ans=sc.next().toUpperCase().charAt(0);
            count++;
            System.out.println();
            if(ans==answers[i]){
                System.out.println("Correct");
                score++;

            }
            else {
                System.out.println("Incprrect !");
            }
        }
        System.out.println("Final score : "+score+" out of "+count);
    }
}

package BrocodeYt;

import java.util.Random;
import java.util.Scanner;

public class BettingGame {
    public static void main(String[] args){
        int balance=100;
        int betAmt,profitAmt;
        String[] decks;

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Welcome to betting game !");
        System.out.println("--------------------");

        while(balance>0){
            System.out.println("Your current balance : $"+balance);
            System.out.println("Place your bet amount :  ");
            betAmt=sc.nextInt();
            sc.nextLine();

            if(betAmt>balance){
                System.out.println("Insufficient balance!");
            }else if(betAmt <=0){
                System.out.println("Bet amount cannot be less than 0");
            }
            else{
                balance-=betAmt;
            }

            System.out.println("Spinning deck");
            decks= spinDeck();
            printDeck(decks);
            profitAmt=calculateProfit(decks,betAmt);
            balance+=profitAmt;


        }
    }
     static String[] spinDeck(){
        String[] decks={"🚘","⚽️","🍖","🍇","🥷"};
        String[] row=new String[3];
         Random random=new Random();

         for(int i=0;i<row .length;i++) {
             row[i] = decks[random.nextInt(decks.length)];

         }
         return row;

     }

     static void printDeck(String[] decks){
         System.out.println(" "+String.join(" | ",decks));
     }


    static int calculateProfit(String[] row, int betAmt) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🚘" -> betAmt * 5;
                case "⚽️" -> betAmt * 4;
                case "🍖" -> betAmt * 3;
                case "🍇" -> betAmt * 6;
                case "🥷" -> betAmt * 10;
                default -> 0;
            };
        }

        return 0;
    }

}

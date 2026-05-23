package BrocodeYt;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of food items : ");
        int num=sc.nextInt();
        sc.nextLine();

        ArrayList<String> foods=new ArrayList<>();
        for(int i=1;i<=num;i++){
            System.out.println("Enter food num : "+i);
            String food=sc.nextLine();
            foods.add(food);

        }
        for(String food : foods){
            System.out.println(food + " ");
        }
    }
}

package SearchField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewSearchFieldExample {
    public static void main(String[] args){
        List<String> products= Arrays.asList(
                "Men","Women","Kids"
        );


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter search : ");
        String input=sc.next().toLowerCase();

        for(String product:products){
            if(product.toLowerCase().contains(input)){
                System.out.println(product);
            }
        }
    }
}

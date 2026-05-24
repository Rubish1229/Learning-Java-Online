package BrocodeYt.Enum;

import java.util.Scanner;

public class EnumExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        String choice=sc.nextLine().toUpperCase();


        Day day=Day.valueOf(choice);
        switch (day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("Its working day");
            case SUNDAY,SATURDAY -> System.out.println("Its weekend day");
        }
    }
}

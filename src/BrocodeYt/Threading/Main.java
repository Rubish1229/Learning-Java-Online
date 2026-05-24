package BrocodeYt.Threading;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name in 5 seconds");

        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Enter name : ");
        String name=sc.nextLine();

        System.out.println("your name is : "+name);
    }
}

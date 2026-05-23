package BrocodeYt;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the time count : ");
         int response=sc.nextInt();

        Timer timer=new Timer();
        TimerTask task=new TimerTask() {

            int count=response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count <=0) {
                    System.out.println("*****************");
                    System.out.println("🎉 Happy New Year! 🎉");
                    System.out.println("*****************");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task,0,1000);
    }
}

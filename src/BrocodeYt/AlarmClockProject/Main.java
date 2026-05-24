package BrocodeYt.AlarmClockProject;

import java.lang.foreign.PaddingLayout;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime=null;



while(localTime==null) {
    try {
        System.out.print("Set your alarm time : ");
        String alarm = sc.next();

        localTime = LocalTime.parse(alarm, dateTimeFormatter);
        System.out.println("Alarm is set for : " + localTime);
    }catch (DateTimeParseException e){
        System.out.println("Invalid time format");
    }

}

        AlarmClock alarmClock=new AlarmClock (localTime);
        Thread thread=new Thread(alarmClock);
        thread.start();

        sc.close();
    }
}

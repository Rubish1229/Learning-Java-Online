package BrocodeYt.AlarmClockProject;

import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime){
        this.alarmTime=alarmTime;
    }

    @Override
    public void run() {
           while(true){
               LocalTime currentTime=LocalTime.now().withNano(0);
               System.out.println("Current Time : "+currentTime);
                if(currentTime.equals(alarmTime)){
                    System.out.println("Alarm is ringing   ⏰ ⏰ ⏰");
                    Toolkit.getDefaultToolkit().beep();
                    break;
                }
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Interrupt exception");
                }

           }

    }
}

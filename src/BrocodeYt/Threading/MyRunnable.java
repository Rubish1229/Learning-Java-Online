package BrocodeYt.Threading;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("Error "+e);
            }

            if(i==5){
                System.out.println("Time is up");
            }
        }
    }
}

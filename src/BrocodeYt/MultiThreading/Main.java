package BrocodeYt.MultiThreading;

public class Main {
    public static void main() throws InterruptedException {
        System.out.println("Start Game");

        Thread t1=new Thread(new MyRunnableMultiThread("TIC"));
        Thread t2=new Thread(new MyRunnableMultiThread("TAC"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Stop!!");

    }
}

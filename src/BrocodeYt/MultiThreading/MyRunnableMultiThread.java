package BrocodeYt.MultiThreading;

public class MyRunnableMultiThread implements Runnable{

    private final String msg;

    public MyRunnableMultiThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
                System.out.println(msg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

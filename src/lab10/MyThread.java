package lab10;

public class MyThread extends Thread {
    boolean interruption = false;
    Synch synch;

    public MyThread(Synch synch) {
        this.synch = synch;
    }

    @Override
    public void run() {
        while (!interruption) {
            synch.print();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
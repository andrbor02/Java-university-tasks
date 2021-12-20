package lab11;

public class MyThread extends Thread {
    Synch synch;
    int number;
    int distance;


    public MyThread(Synch synch, int number, int distance) {
        this.synch = synch;
        this.number = number;
        this.distance = distance;
    }

    @Override
    public void run() {
        while (!synch.printResult(number, distance)) {
            distance += 33;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void go(Synch synch, int n) {
        for (int i = 0; i < n; i++) {
            MyThread thread = new MyThread(synch, i, 0);
            System.out.println("Horse" + i + " ride away!");
            thread.start();
        }
    }
}

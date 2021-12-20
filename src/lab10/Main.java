package lab10;

import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);

        Synch synch = new Synch();
        MyThread myThread1 = new MyThread(synch);
        MyThread myThread2 = new MyThread(synch);
        myThread1.start();
        myThread2.start();

        in.next();
        myThread1.interruption = true;
        myThread2.interruption = true;
    }
}
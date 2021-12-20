package lab11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 20) {
            System.out.println("Too many horses");
            return;
        }

        Synch synch = new Synch();
        synch.totalDistance = 100;

        MyThread.go(synch, n);
    }
}
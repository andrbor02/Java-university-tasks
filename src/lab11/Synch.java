package lab11;

public class Synch {
    public int totalDistance;

    public synchronized boolean printResult(int number, int distance) {
        if (totalDistance <= distance) {
            System.out.println("Horse" + number + " have finished!");
            return true;
        } else {
            System.out.println("Horse" + number + " on " + distance + " km!");
            return false;
        }
    }
}

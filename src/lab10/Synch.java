package lab10;

import java.util.Objects;

public class Synch {
    String state = "Ping";

    public synchronized void print() {
        if (Objects.equals(state, "Ping")) {
            System.out.println("Pong");
            state = "Pong";
        } else if (Objects.equals(state, "Pong")) {
            System.out.println("Ping");
            state = "Ping";
        }
    }
}

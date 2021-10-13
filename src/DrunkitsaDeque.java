import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class DrunkitsaDeque implements Comparator<Integer> {
    Scanner in = new Scanner(System.in);

    @Override
    public int compare(Integer o1, Integer o2) { // if o1 > o2 returns 1 else returns 0
        if (o1 == 0 && o2 == 9) {
            return 1;
        } else if (o1 == 9 && o2 == 0) {
            return 0;
        } else {
            return Integer.compare(o1, o2);
        }
    }

    Deque<Integer> first = new ArrayDeque<>();
    Deque<Integer> second = new ArrayDeque<>();
    int turn = 0;

    public DrunkitsaDeque() {
        initDecks();
        coachGame();
        showResult();
    }

    public void initDecks() {
        for (int i = 0; i < 5; i++) {
            first.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.add(in.nextInt());
        }

        //showDecks();
    }

    public void coachGame() {
        for (turn = 0; turn < 106; turn++) {
            if (second.isEmpty() || first.isEmpty()) {
                break;
            }

            if (compare(first.getFirst(), second.getFirst()) > 0) {
                first.add(first.pollFirst());
                first.add(second.pollFirst());
            } else {
                second.add(first.pollFirst());
                second.add(second.pollFirst());
            }
        }
    }

    public void showResult() {
        if (first.isEmpty()) {
            System.out.println("second " + turn);
        } else if (second.isEmpty()) {
            System.out.println("first " + turn);
        } else if (turn == 106) {
            System.out.println("botva");
        }
    }

    public void showDecks() {
        for (int card : first)
            System.out.print(card + " ");
        System.out.println();

        for (int card : second)
            System.out.print(card + " ");
        System.out.println();
    }
}

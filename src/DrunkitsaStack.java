import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class DrunkitsaStack implements Comparator<Integer> {
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

    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();
    int turn = 0;

    public DrunkitsaStack() {
        initDecks();
        coachGame();
        showResult();
    }

    public void initDecks() {
        for (int i = 0; i < 5; i++) {
            first.push(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.push(in.nextInt());
        }

        //showDecks();
    }

    public void coachGame() {
        for (turn = 0; turn < 106; turn++) {
            if (second.empty() || first.empty()) {
                break;
            }

            if (compare(first.peek(), second.peek()) > 0) {
                first.add(0, first.pop());
                first.add(0, second.pop());
            } else {
                second.add(0, first.pop());
                second.add(0, second.pop());
            }
        }
    }

    public void showResult() {
        if (first.empty()) {
            System.out.println("second " + turn);
        } else if (second.empty()) {
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

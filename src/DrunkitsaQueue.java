import java.util.*;

public class DrunkitsaQueue implements Comparator<Integer> {
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

    Queue<Integer> first = new PriorityQueue<>();
    Queue<Integer> second = new PriorityQueue<>();

    Queue<Integer> firstTemp = new LinkedList<>();
    Queue<Integer> secondTemp = new LinkedList<>();
    int turn = 0;

    public DrunkitsaQueue() {
        initDecks();
        //coachGame();
        //showResult();
    }

    public void initDecks() {
        for (int i = 0; i < 5; i++) {
            first.offer(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.offer(in.nextInt());
        }

        showDecks();
    }

    public void coachGame() {
        for (turn = 0; turn < 106; turn++) {
            if (second.isEmpty() || first.isEmpty()) {
                break;
            }

            if (compare(first.element(), second.element()) > 0) {
                firstTemp.add(first.poll());
                firstTemp.add(second.poll());
                firstTemp.addAll(first);
                first = firstTemp;
            } else {
                secondTemp.add(first.poll());
                secondTemp.add(second.poll());
                secondTemp.addAll(second);
                second = secondTemp;
            }
        }
    }

    public void showResult() {
        if (first.isEmpty()) {
            System.out.println("first + " + turn);
        } else if (second.isEmpty()) {
            System.out.println("second " + turn);
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

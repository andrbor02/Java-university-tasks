import java.util.ArrayList;

public class Exc7 {
    ArrayList<Integer> dividers = new ArrayList<>();

    public Exc7(int number) {
        recurs7(number, 1);
        System.out.println(dividers.toString());
    }

    public int recurs7(int number, int divider) {
        if (divider > (int)Math.sqrt(number)) {
            dividers.add(number);
            return 1;
        }

        if (number % divider == 0) {
            dividers.add(divider);
            number /= divider;
            System.out.println(divider);
        }
        return recurs7(number, divider + 1);
    }
}

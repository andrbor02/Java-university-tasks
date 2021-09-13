public class Exc6 {
        public Exc6(int number) {
            recurs6(number, 2);
        }

    public int recurs6(int number, int divider) {
        if (number == divider) {
            System.out.println("YES");
            return 1;
        }

        if (number % divider == 0) {
            System.out.println("NO");
            return 1;
        }

        return recurs6(number, divider + 1);
    }
}

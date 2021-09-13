public class Exc5 {
    int sum = 0;

    public Exc5(int number) {
        System.out.println("Ecx5: " + recurs5(number));
    }
    
    public int recurs5(int number) {
        sum += number % 10;

        if (number / 10 == 0) {
            return sum > 0 ? sum : -sum;
        }

        return recurs5(number / 10);
    }
}

public class Exc4 {
    private int k;
    private int s;
    private int counter = 0;

    public Exc4(int k, int s) {
        this.k = k;
        this.s = s;

        recurs4((int) Math.pow(10, k));
    }

    public int recurs4(int number) {
        //if ((int) Math.log10(number) > k)
        if (counter > 20) {
            System.out.println("Exc4: " + counter);
            return 1;
        }

        if (sumOfDigits(number) == s) {
            //System.out.println(number); // выводит подходящие числа
            counter++;
        }
        return recurs4(number + 1);
    }

    private int sumOfDigits(int numb) {
        int sum = 0;

        while (numb != 0) {
            sum += (numb % 10);
            numb /= 10;
        }
        return sum;
    }
}

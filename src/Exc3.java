public class Exc3 {
    public Exc3(int A, int B) {
        recurs3(A, B);
    }

    public int recurs3(int A, int B) {
        System.out.println(A);
        if (A < B) {
            return recurs3(A + 1, B);
        } if (A > B) {
            return recurs3(A - 1, B);
        } else {
            return 1;
        }
    }
}

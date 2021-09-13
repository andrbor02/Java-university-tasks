public class Exc8 {
    public Exc8(String word) {
        recurs8(word);
    }

    public int recurs8(String word) {
        if (word.length() <= 1) {
            System.out.println("Exc8: YES");
            return 1;
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            word = word.substring(1, word.length() - 1);
            return recurs8(word);
        } else {
            System.out.println("Exc8: NO");
            return 1;
        }
    }
}
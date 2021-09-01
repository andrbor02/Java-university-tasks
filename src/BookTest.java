public class BookTest {
    public static void testMyBooks() {
        Book book1 = new Book();
        Book book2 = new Book("Война и мир");
        Book book3 = new Book("Idiot", 666);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println(book1.shouldIRead());
        System.out.println(book2.shouldIRead());
        System.out.println(book3.shouldIRead());
    }
}

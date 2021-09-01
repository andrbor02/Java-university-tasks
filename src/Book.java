public class Book {
    private String name;
    private int numberOfPages;

    public Book() {
        name = "default";
        numberOfPages = 0;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public boolean shouldIRead() {
        return !name.equals("Война и мир") && numberOfPages <= 500;
    }
}

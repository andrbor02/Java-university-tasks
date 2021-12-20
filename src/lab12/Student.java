package lab12;

public class Student {
    private int number;
    private String name;
    private long inn;

    public Student(int number, String name, long inn) {
        this.number = number;
        this.name = name;
        this.inn = inn;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public long getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", inn=" + inn +
                '}';
    }
}
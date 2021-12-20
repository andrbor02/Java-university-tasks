package lab6;

public class Student {
    private int number;
    private String name;
    private int finalBall;

    public Student(int number, String name, int finalBall) {
        this.number = number;
        this.name = name;
        this.finalBall = finalBall;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getFinalBall() {
        return finalBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", finalBall=" + finalBall +
                '}';
    }
}
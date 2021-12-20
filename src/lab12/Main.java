package lab12;

import java.util.ArrayList;

public class Main {

    static class InnException extends Exception {
        public InnException(String message) {
            super(message);
        }
    }

    static class NotFoundException extends Exception {
        public NotFoundException(String message) {
            super(message);
        }
    }

    static void checkInn(String inn) throws InnException {
        ValidInnChecker checker = new ValidInnCheckerImpl();
        if (!checker.getValidInn().contains(inn)) {
            throw new InnException("Not valid Inn");
        }
    }

    static void findStudent(ArrayList<lab12.Student> students, String name) throws InnException, NotFoundException {
        boolean contains = false;
        for (lab12.Student student : students) {
            if (student.getName().equals(name)) {
                contains = true;
                checkInn(String.valueOf(student.getInn()));
            }
        }
        if (!contains) {
            throw new NotFoundException(name + " not found");
        }
    }

    public static void main(String[] args) {
        ArrayList<lab12.Student> students = new ArrayList<>();
        students.add(new lab12.Student(1, "Vasya", 1234567890));
        students.add(new lab12.Student(2, "Anton", 777777777));
        students.add(new lab12.Student(3, "Egor", 1234567890));

        try {
            //findStudent(students, "Vasya");
            //findStudent(students, "Anton");
            findStudent(students, "Igor");
            System.out.println("OK");
        } catch (InnException | NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


}
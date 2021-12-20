package lab6;

import java.util.LinkedList;

public class StudentSort {
    public static LinkedList<Student> sortByIDNumber(Student[] students) {
        LinkedList<Student> sortedStudents = new LinkedList<>();
        sortedStudents.add(students[0]);

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            for (int j = 0; j < sortedStudents.size(); j++)
                if (student.getNumber() > sortedStudents.get(j).getNumber()) {
                    sortedStudents.add(j, student);
                    break;
                }

        }
        return sortedStudents;
    }
}
/*
 * 1 беру
 * 2 прохожу ищя пока не больше
 * 3 вставляю
 * */
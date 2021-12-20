package lab6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Vasya", 280);
        students[1] = new Student(3, "Kolya", 240);
        students[2] = new Student(5, "Archi", 258);
        students[3] = new Student(8, "Vanya", 232);
        students[4] = new Student(2, "Seva", 259);
        students[5] = new Student(6, "Van", 252);
        students[6] = new Student(7, "Billy", 212);
        students[7] = new Student(10, "Ilya", 245);
        students[8] = new Student(9, "Dima", 283);
        students[9] = new Student(4, "Timur", 228);

// 1
//        LinkedList<Student> sts1 = StudentSort.sortByIDNumber(students);
//        Iterator<Student> it = sts1.descendingIterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

// 2
//        SortingStudentsByGPA sts2 = new SortingStudentsByGPA();
//        sts2.quickSort(students, 0, students.length - 1);
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }

// 3
        SortingStudentsMergeSort sts3 = new SortingStudentsMergeSort();
        sts3.SortUnsorted(students, 0, students.length - 1);
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
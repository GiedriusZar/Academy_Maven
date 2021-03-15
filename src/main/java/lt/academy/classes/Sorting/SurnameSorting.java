package lt.academy.classes.Sorting;

import lt.academy.classes.Student;

import java.util.Comparator;

public class SurnameSorting implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSurname().compareTo(s2.getSurname());
    }
}
package lt.academy.classes.Sorting;

import lt.academy.classes.Student;

import java.util.Comparator;

public class NumberSorting implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getNumber() - s2.getNumber();
    }
}

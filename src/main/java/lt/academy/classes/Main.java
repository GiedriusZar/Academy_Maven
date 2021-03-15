package lt.academy.classes;

import lt.academy.classes.Sorting.NameSorting;
import lt.academy.classes.Sorting.NumberSorting;
import lt.academy.classes.Sorting.SurnameSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        JavaStudentGroup studentGroup = new JavaStudentGroup();

        List<Student> simpleList = new ArrayList<>();
        simpleList = studentGroup.studentList;
        List<Student> numberList = numberList(simpleList, new NumberSorting());
        List<Student> nameList = nameList(simpleList, new NameSorting());
        List<Student> surnameList = surnameList(simpleList, new SurnameSorting());

        studentGroup.addStudent(new Student("Giedrius", "Giedraitis", 5));
        studentGroup.addStudent(new Student("Tomas", "Tomaitis", 7));
        studentGroup.addStudent(new Student("Lukas", "Lukaitis", 8));
        studentGroup.addStudent(new Student("Jonas", "Jonaitis", 6));
        studentGroup.addStudent(new Student("Petras", "Petraitis", 1));
        studentGroup.addStudent(new Student("Rokas", "Rokaitis", 6));
        studentGroup.addStudent(new Student("Giedrius", "Lukaitis", 4));
        studentGroup.addStudent(new Student("Tomas", "Jonaitis", 3));
        studentGroup.addStudent(new Student("Petras", "Rokaitis", 7));
        studentGroup.addStudent(new Student("Lukas", "Giedraitis", 10));
        studentGroup.addStudent(new Student("Jonas", "Lukaitis", 15));
    }

    private static void getStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public static List<Student> numberList(List<Student> originalList, Comparator<Student> comparator) {
        originalList.sort(comparator);

        return new ArrayList<>(originalList);
    }

    public static List<Student> nameList(List<Student> originalList, Comparator<Student> comparator) {
        originalList.sort(comparator);

        return new ArrayList<>(originalList);
    }

    public static List<Student> surnameList(List<Student> originalList, Comparator<Student> comparator) {
        originalList.sort(comparator);

        return new ArrayList<>(originalList);
    }

}



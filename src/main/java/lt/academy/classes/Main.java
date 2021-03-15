package lt.academy.classes;

import lt.academy.classes.Sorting.NameSorting;
import lt.academy.classes.Sorting.SurnameSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        JavaStudentGroup studentGroup = new JavaStudentGroup();

        List<Student> simpleList = new ArrayList<>();
        List<Student> numberList = new ArrayList<>();
        List<Student> nameList = new ArrayList<>();
        List<Student> surnameList = new ArrayList<>();

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

        getStudents(studentGroup.studentList);
//        System.out.println("--------------------------------");
//        Collections.sort(studentGroup.studentList);
//        getStudents(studentGroup.studentList);
//        System.out.println("--------------------------------");
//        studentGroup.studentList.sort(new NameSorting());
//        getStudents(studentGroup.studentList);
//        System.out.println("--------------------------------");
//        studentGroup.studentList.sort(new SurnameSorting());
//        getStudents(studentGroup.studentList);


    }

    private static void getStudents (List <Student> students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public void addToSimpleList (List <Student> originalList, List <Student> newList){


    }
    public void addToNumberList (List <Student> originalList, List <Student> newList){


    }
    public void addToNameList (List <Student> originalList, List <Student> newList){


    }
    public void addToSurnameList (List <Student> originalList, List <Student> newList){


    }


    }



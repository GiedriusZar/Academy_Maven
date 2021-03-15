package lt.academy.classes;


import java.util.ArrayList;
import java.util.List;

public class JavaStudentGroup {

    List<Student> studentList;

    public JavaStudentGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    }


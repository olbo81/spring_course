package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Oleg", 4, 4.2);
        Student st2 = new Student("Ivan", 3, 4);
        Student st3 = new Student("Kolyan", 2, 3.3);
    }
}

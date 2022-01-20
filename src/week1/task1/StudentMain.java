package week1.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setName("Orxan");
        student1.setSurname("Ibrahimov");
        student1.setAge(29);

        student2.setName("Orxan");
        student2.setSurname("Ismayilov");
        student2.setAge(29);

        student3.setName("Umid");
        student3.setSurname("Mahmudov");
        student3.setAge(19);

        student4.setName("Alim");
        student4.setSurname("Qasimov");
        student4.setAge(19);

        student5.setName("Elcin");
        student5.setSurname("Memmedov");
        student5.setAge(37);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println(studentList);
    }
}

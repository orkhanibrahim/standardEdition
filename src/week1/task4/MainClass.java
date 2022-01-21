package week1.task4;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Orxan",28));
        studentList1.add(new Student("Elvin",21));
        studentList1.add(new Student("Fariz",27));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Orxan",28));
        studentList2.add(new Student("Elvin",21));

        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(new Student("Orxan",28));
        studentList3.add(new Student("Elvin",21));
        studentList3.add(new Student("Fariz",27));
        studentList3.add(new Student("Fariz",27));

        System.out.println(new Teacher("Umid",studentList1));
        System.out.println(new Teacher("Resad",studentList2));
        System.out.println( new Teacher("Elmar",studentList3));
    }
}

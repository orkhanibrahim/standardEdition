package week1.task5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Orxan",29));
        studentList1.add(new Student("Elixan",28));
        studentList1.add(new Student("Elxan",18));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Hemid",28));
        studentList2.add(new Student("Qehreman",17));
        studentList2.add(new Student("Ilyas",18));

        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(new Student("Elcan",30));
        studentList3.add(new Student("Natiq",28));
        studentList3.add(new Student("Eldeniz", 15));

        Teacher teacher1 = new Teacher("Umid",studentList1);
        Teacher teacher2 = new Teacher("Javad",studentList2);
        Teacher teacher3 = new Teacher("Hamlet",studentList3);

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);


    }
}

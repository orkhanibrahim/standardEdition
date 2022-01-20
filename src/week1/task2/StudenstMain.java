package week1.task2;

import java.util.ArrayList;
import java.util.List;

public class StudenstMain {


    public static void main(String[] args) {

        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("Orxan", "Ibrahimov", 29));
        studentList.add(new Students("Orxan", "Ismayilov", 29));
        studentList.add(new Students("Umid", "Mahmudov", 19));
        studentList.add(new Students("Alim", "Qasimov", 19));
        studentList.add(new Students("Elcin", "Memmedov", 37));
        studentList.add(new Students("Eldar", "Ehmedov", 19));
        studentList.add(new Students("Vasif", "Dadasov", 23));
        studentList.add(new Students("Ilham", "Muradli", 19));
        studentList.add(new Students("Sakir", "Qismetov", 24));
        studentList.add(new Students("Novruz", "Eldarov", 19));

        for (Students students : studentList) {
            if (students.getAge() == 19) {
                System.out.println(students);
            }
        }
    }

}

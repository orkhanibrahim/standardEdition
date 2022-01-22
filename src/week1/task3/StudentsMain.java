package week1.task3;


import java.util.ArrayList;
import java.util.List;

public class StudentsMain {


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

        for (int i = 0; i < studentList.size() - 1; i++) {
            int a = i;
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(a).getAge() > studentList.get(j).getAge())
                    a = j;
            }
            Students temporary = studentList.get(i);
            studentList.set(i, studentList.get(a));
            studentList.set(a, temporary);
        }
        System.out.println(studentList);


    }
}

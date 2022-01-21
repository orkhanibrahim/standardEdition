package week1.task3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsMain  {



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

        studentList.sort(Comparator.comparing(Students::getAge));

        System.out.println(studentList);

    }


}

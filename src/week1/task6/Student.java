package week1.task6;

import java.util.ArrayList;
import java.util.List;

/**
 * List stundent olsun,studentin totalPoint adinda bir dene qiymeti olsun,
 * yeni method yaz, hemen method list studenti gonderende, studentin adi
 * ve qaabaginda qiymetine gore derecesi dushsun. 90> elaci; 80>90 zerbeci;
 * 70>80a normalci; 60>70 olmadikici, 60< ayibci
 */


public class Student {
    private String name;
    private double totalPoint;

    public Student(String name, double totalPoint) {
        this.name = name;
        this.totalPoint = totalPoint;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public List<Student> addStudentToList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Elnur", 77));
        list.add(new Student("Musviq", 47));
        list.add(new Student("Elvin", 97));
        list.add(new Student("Serxan", 87));
        list.add(new Student("Ehmed", 67));
        return list;
    }


    public void showStudentNameAndDegree(List<Student> studentList) {
        for (Student student : studentList) {
            if (student.totalPoint > 90 && totalPoint < 100) {
                System.out.println("Student name : " + student.getName() + " Degree : Elaci");
            } else if (student.totalPoint > 80 && totalPoint < 90) {
                System.out.println("Student name : " + student.getName() + " Degree : Zerbeci");
            } else if (student.totalPoint > 70 && totalPoint < 80) {
                System.out.println("Student name : " + student.getName() + " Degree : Normalci");
            } else if (student.totalPoint > 60 && student.totalPoint < 70) {
                System.out.println("Student name : " + student.getName() + " Degree : Olmadikici");
            } else {
                System.out.println("Student name : " + student.getName() + " Degree : Ayibci");
            }

        }

    }


}

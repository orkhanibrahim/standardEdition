package week1.task2;

import java.util.ArrayList;
import java.util.List;

public class StudenstMain {


    public static void main(String[] args) {

        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();
        Students student5 = new Students();
        Students student6 = new Students();
        Students student7 = new Students();
        Students student8 = new Students();
        Students student9 = new Students();
        Students student10 = new Students();


        setAndGetStudentInfo(student1,"Orxan","Ibrahimov",29);
        setAndGetStudentInfo(student2,"Orxan","Ismayilov",29);
        setAndGetStudentInfo(student3,"Umid","Mahmudov",19);
        setAndGetStudentInfo(student4,"Alim","Qasimov",19);
        setAndGetStudentInfo(student5,"Elcin","Memmedov",37);
        setAndGetStudentInfo(student6,"Eldar","Ehmedov",19);
        setAndGetStudentInfo(student7,"Vasif","Dadasov",23);
        setAndGetStudentInfo(student8,"Ilham","Muradli",19);
        setAndGetStudentInfo(student9,"Sakir","Qismetov",24);
        setAndGetStudentInfo(student10,"Novruz","Eldarov",19);

        List<Students> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        for(Students students : studentList){
            if(students.getAge() == 19){
                System.out.println(students);
            }
        }
    }



    private static void setAndGetStudentInfo(Students student,String name, String surname, int age) {
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
    }
}

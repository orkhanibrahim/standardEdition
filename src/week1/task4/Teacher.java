package week1.task4;

import java.util.List;

public class Teacher {
    private String name;
    private List<Student> student;

    public Teacher(String name, List<Student> student){
        this.name = name;
        this.student = student;
    }

    public String toString(){
        return "Teacher : " + name + "--> " + student;
    }
}

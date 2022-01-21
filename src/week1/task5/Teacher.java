package week1.task5;


import java.util.List;

public class Teacher {
    private String name;
    private List<Student> students;

    public Teacher(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }

    public String toString(){
        return "Teacher : " + name + "--> " + students;
    }
}

package week1.task4;

public class Teacher {
    private String name;
    private Student student;

    public Teacher(String name, Student student){
        this.name = name;
        this.student = student;
    }

    public String toString(){
        return "Teacher : " + name + "--> " + student;
    }
}

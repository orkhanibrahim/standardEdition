package week1.task4;

public class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString(){
        return " Student : { " + name + " : " + surname + " : " + age + "}";
    }
}

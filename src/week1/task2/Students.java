package week1.task2;

public class Students {
    private String name;
    private String surname;
    private int age;

    public Students(String name,String surname, int age){

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Students(){

    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "{ "+name + " , " + surname + " , "+ age + "}";
    }
}
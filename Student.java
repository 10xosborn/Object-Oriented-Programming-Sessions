public class Student{
    //Static
    //Attribute

    private final String name;
    private final int age;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method

    public String name(){
        return name;
    }

    public int age(){
        return age;
    }
    
    public String StudentDetails(){
        return "Student name is " + name + " and age is " + age;
    }
}
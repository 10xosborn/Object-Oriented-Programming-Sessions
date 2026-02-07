public class Students {
    
    final String name;
    int age;
    
    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String studentDetails(){
        return "Name: " + name + ", Age: " + age;
    }
    
    public static void main(String[] args) {
        Students studentObject = new Students("Osborn", 10);
        System.out.println(studentObject.studentDetails());
    }
}
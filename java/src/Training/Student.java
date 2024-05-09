package Training;

public class Student {
	 String name;


    public Student() {
        this.name = "Unknown";
        System.out.println(name);
    }

 
    public Student(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        
        Student student1 = new Student(); 
        Student student2 = new Student("Anuhya"); 

      
        
    }
}



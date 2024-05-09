package pack1;
import java.util.Scanner;

public class Encapsulationcon {
	void methd1(){
		Scanner sc=new Scanner(System.in);
		Encapsulation obj=new Encapsulation();
		System.out.println("enter yor name");
		String name=sc.next();
		obj.setStuname(name);
		System.out.println("enter your attendence %");
		int attendence=sc.nextInt();
		obj.setAttendence(attendence);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		obj.setMarks(marks);
	    System.out.println("details of the student");
		System.out.println("student name:"+obj.getStuname());
		System.out.println("marks:"+obj.getMarks());
		System.out.println("attendence:"+obj.getAttendence());
		sc.close();
	}
	public static void main(String[] args) {
		new Encapsulationcon().methd1();
	}

}

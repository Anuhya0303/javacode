package Training;
import java.util.Scanner;
public class Grades {
	int marks;
	public void grade(int marks)
	{
		if (marks >91 & marks < 100) {
			System.out.println("grade AA");
			
		}
		else if(marks > 81 & marks <90){
			System.out.println("grade AB");
		}
		else if(marks > 71 & marks <80){
			System.out.println("grade BB");
		}
		else if(marks > 61 & marks <70){
			System.out.println("grade BC");
		}
		else if(marks > 51 & marks <60){
			System.out.println("grade CC");
		}
		else if(marks > 41 & marks <50){
			System.out.println("grade CD");
		}
		else
		{
			System.out.println("f");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		Grades aobj1 = new Grades();
		aobj1.grade(marks);
		sc.close();
		
		
	}

}

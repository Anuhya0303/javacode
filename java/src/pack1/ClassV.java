package pack1;
import java.util.Scanner;
public class ClassV {
	Scanner sc=new Scanner(System.in);
	int z=sc.nextInt();
	public void methd1(int z)
	   {
		 int i=3;
		 int age=18;
		 for(;i<10;i++)
		 {
			 System.out.println(++i);
			 if(i==8)
			 {
				for(;i<=15;i++)
				{
				System.out.println(++i);
				while(i==15)
				{
					System.out.println(i++);
					do
					{
					System.out.println(i);
					i++;
					if(i==19)
						break;
					}
					while(i>15);
					
					switch(i=19)
					{
					case 19:
						System.out.println(i);
						break;
					case 20:
						System.out.println("20");
						break;
					default:
						System.out.println("invalid input");
					}
					if(age==18)
					{
						System.out.println("eligible to vote");
					}
					else
						System.out.println("not eligible to vote");
					
			        if(z%2==0)
			        {
			        	System.out.println(z+"is even number");
			        }
			        else if(z%2==1)
			        {
			        	System.out.println(z+"is odd number");
			        }
			        else
			        	System.out.println(z+"is zero");
				    }
					
					
					
					
					}
				}
			 }
		 }
			 
			 
		 
	public void methd2(int i)
	{
		while(i<=10)
		{
			System.out.println(i+++" "+i++);
			i++;
		}
	}
	   
	public static void main(String[] args) {
		ClassV obj=new ClassV();
		obj.methd1(10);
		obj.methd2(1);
	}
}

package pack1;

public class ClassQ {
	public void methd1(int num)
	{
	if(num%2==0 && num<5 )
	{
		System.out.println("not weird");
	}
	else if(num%2==0 && num>6 && num<20)
	{
		System.out.println("weird");
	}
	else if(num%2==0 && num>20)
	{
	System.out.println("not weird");	
	}
	else
	{
		System.out.println("weird");
	}
	}
	public static void main(String[] args) {
		ClassQ obj=new ClassQ();
		obj.methd1(24);
	}
}

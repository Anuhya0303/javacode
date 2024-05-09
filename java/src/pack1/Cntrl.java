package pack1;

public class Cntrl {
	public int methd1(int age)
	{
		
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else 
			System.out.println("not eligible to vote");
		return 0;
	}
	public void methd2()
	{
		int i=25;
		if(i>30)
		{
			System.out.println("if block executed");
		}
		System.out.println("methd2() executed");
	}
	public int methd3(int i)
	{
		if(i>20)
		{
			return 300;
		}
		return 100;
	}
	public int methd4()
	{
		if(true)
		{
			System.out.println("if block executed");
		}
		return 0;
	}
	public void methd5(int i)
	{
	if(i>0)
	{
		System.out.println("i is evn number");	
	}
	else if(i<0)
	{
		System.out.println("i is negative number");
	}
	else
	System.out.println("i is 0");
	}
	public static void main(String[] args) {
		Cntrl obj=new Cntrl();
		obj.methd1(35);
		obj.methd2();
		System.out.println(obj.methd3(10));
		obj.methd4();
		obj.methd5(34);
	}

}

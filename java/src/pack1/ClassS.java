package pack1;

public class ClassS {
	//greatest of three numbers
	public void methd1(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is greater");
			}
		}
		else if(y>z)
		{
			System.out.println(y+" is greater");
		}
		else
		{
			System.out.println(z+" is greater");
		}
	}
	public static void main(String[] args) {
		ClassS obj=new ClassS();
		obj.methd1(300,200,100);

}
}

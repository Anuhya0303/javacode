package pack1;

public class ClassY {
	int x;
	int y;
	static String name="anu";
	void meth1()
	{
		int z=10;
		int x=10;
		System.out.println(z);//10
		System.out.println(x);//10
		System.out.println(new ClassY().x);
	}
public static void main(String[] args) {
	ClassY obj1=new ClassY();
	obj1.meth1();
	System.out.println(obj1.x);//0
	System.out.println(obj1.y);//0
	System.out.println(ClassY.name);
}
	}

package pack1;

public class ClassA 
{
	int meth1()
	{
		int a=10;
		a++;
		System.out.println(a++);
		a++;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++);
		a--;
		System.out.println(--a);
		a=a++ +3;
		System.out.println("a values =>"+a);
		System.out.println(a++);
		--a;
		System.out.println(--a);
		System.out.println(a--);
		a=a-- +3;
		return a++ + ++a;
	}
	void meth2()
	{
		int a=10;
		int x=new ClassA().meth1()+a++;
		System.out.println(x++ + a++);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(x);
		
	}
public static void main(String[] args) {
	System.out.println("start");
	new ClassA().meth2();
	System.out.println("java is awesome");
}
}

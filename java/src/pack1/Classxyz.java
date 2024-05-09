package pack1;

public class Classxyz {
	int d=10;
	public void meth1()
	{
	System.out.println("void methd done");	
	}
	public String meth2(int a,String name)
	{
	System.out.println("parametrized methd done");	
	 return "java";
	}
	public int meth3()
	{
		System.out.println("returned methd done");
		return 100;
	}
	public Classxyz()
	{
		System.out.println("non parametrized constructor done");
	}
	public Classxyz(int a)
	{
		System.out.println("parametrized constructor done");
	}
	public void operators()
	{
		int a=100;
		int b=30;
		a++;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
        System.out.println("increment decrement done");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("arthametic done");
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
			System.out.println("b is greater");
		boolean greaterthan =a>=b;
		System.out.println(greaterthan);
		System.out.println("relational operators done");
		Boolean A=true;
		Boolean B=false;
		System.out.println(A&B);
		System.out.println(A||B);
		System.out.println(!A);
		System.out.println(d);
		
	}
	static void meth4()
	{
		System.out.println("static methd done");
	}
	public void meth5()
	{
		System.out.println("implicit casting done");
		int e=10;
		long f=e;
		System.out.println(e);
		System.out.println(f);
		int g='A';
		System.out.println(g);
		System.out.println("explicit conversion done");
		double y=23456.67;
		int z=(int)y;
		System.out.println(y);
		System.out.println(z);
	}
	public void methd6() 
	{
		int i=20;
		Integer z=i;
		System.out.println(z);
		System.out.println(new Integer(i));
		int i1=Integer.valueOf(i);
		System.out.println(i1);
		
		
		
	}
	public static void main(String[] args) {
		
	Classxyz obj1=new Classxyz();
	obj1.meth1();
	String S=obj1.meth2(10,"Anu");
	System.out.println(S+ " is awesome");
	int x=obj1.meth3();
	System.out.println(x);
	System.out.println("object class started ");
	int hashcode=obj1.hashCode();
	System.out.println(hashcode);
	Classxyz obj2=new Classxyz();
	System.out.println(obj1.equals(obj2));
	System.out.println(obj2.getClass());
	System.out.println(obj1.getClass());
	System.out.println(obj1.toString());
	System.out.println("object class ended");
	new Classxyz();
	new Classxyz(20);
	obj1.operators();
	meth4();
	System.out.println(s);
	System.out.println(obj1.s);
	System.out.println(Classxyz.s);
	System.out.println(obj1.d);
	System.out.println("variables done");
	obj1.meth5();
	obj1.methd6();
	}
	static int s=20;
	static
	{
	System.out.println("static block excecuted");	
	}

}

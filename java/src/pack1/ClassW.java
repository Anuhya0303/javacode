package pack1;

public class ClassW {
	void implicit()
	{
		byte b=10;
		System.out.println("byte"+b);
		short s=b;
		System.out.println("short"+s);
		s++;
		int i=s++;
		System.out.println("int"+i);
		System.out.println("short"+s);
		long l=i;
		System.out.println("long"+(--l));
		float f=l;
		System.out.println("float"+(f+b));
		double d=(--f);
		System.out.println("double"+d);
		show();
		if(!(d==f))
		{
			System.out.println("equal");
			
        }
		else
		{
			System.out.println("not equal");
	    }
		}
	public static void main(String[] args) {
		ClassW a=new ClassW();
		a.implicit();
	}
	static void show() {
		char c='A';
		int a=++c;
		System.out.println(a);
		ClassW obj=new ClassW();
		String s=obj.meth1();
		System.out.println(s);
		
	}
	String meth1() {
		String s="implicit is done by compiler automatically";
		return s;
	}
}

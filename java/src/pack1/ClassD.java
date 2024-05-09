package pack1;

public class ClassD {
	 ClassD methd1()
	{
	ClassD aobj=new ClassD();
	System.out.println(aobj);
	return aobj;
	}
	 public void finalize()
	 {
		System.out.println("garbage has been collected"); 
	 }
	 
public static void main(String[] args) {
	ClassD x=new ClassD();
	System.out.println(x);
ClassD obj=new ClassD();
int a=obj.hashCode();
	System.out.println(a);
	System.out.println(obj.equals(obj));
	ClassD obj1=new ClassD();
	System.out.println(obj1.equals(obj));
	System.out.println(obj1.getClass());
	System.out.println(obj.toString());
	System.out.println(obj1.toString());
	System.gc();
	ClassD obj2=new ClassD();
     obj2=null;
	
}
}

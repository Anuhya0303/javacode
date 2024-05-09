package pack1;

public class ClassX {
	String empname;
	int empid;
	int empage;
	String empfield;
	static String empcompany="tcs";
ClassX(String name,int id,int age,String field)
{
empname=name;
empid=id;
empage=age;
empfield=field;
}
public static void main(String[] args) {
ClassX obj1=new ClassX("anuhya",1,21,"developer");
ClassX obj2=new ClassX("meghana",2,21,"sw engineer");
System.out.println(obj1.empname+obj1.empid+obj1.empage+obj1.empfield+ClassX.empcompany);
System.out.println(obj2.empname+obj2.empid+obj2.empage+obj2.empfield+ClassX.empcompany);
obj1.empname="Shekar";
System.out.println(obj1.empname+obj1.empid+obj1.empage+obj1.empfield+ClassX.empcompany);
obj1.empcompany="kpit";
System.out.println(obj1.empname+obj1.empid+obj1.empage+obj1.empfield+ClassX.empcompany);
System.out.println(obj2.empname+obj2.empid+obj2.empage+obj2.empfield+ClassX.empcompany);

}
		
	}



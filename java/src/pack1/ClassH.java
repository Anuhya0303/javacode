package pack1;
import java.util.Scanner;
public class ClassH {
	static Scanner sc=new Scanner(System.in);
	public int methd1(int a,String data)
	{
		System.out.println("a value:"+a);
		System.out.println("data value:"+data);
		int z=sc.nextInt();
	    return z;	
	}
	public String methd2(int x,int y)
	{
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
		String s=sc.next();
		return s;
	}
	public int methd3(int i)
	{
		System.out.println("i value:"+i);
		int v=sc.nextInt();
		return v;
	}
    public static void main(String[] args) {
    	ClassH obj=new ClassH();
    	//System.out.println("enter value of i");
    	int i=sc.nextInt();
        //int a=obj.methd3(i);
        //System.out.println("enter the value of x");
        int x=sc.nextInt();
        //System.out.println("enter the value of y");
        int y=sc.nextInt();
    	//String data=obj.methd2(x,y);
    	System.out.println(obj.methd1(obj.methd3((i)),obj.methd2(x,y)));
    	
	
    }

    }

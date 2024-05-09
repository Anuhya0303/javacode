package pack1;

public class ClassZ {

	public String methd1(int a,int b)//main a=10,b=20
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
	return "java";
	//java to main methd

	//String l=aobj.methd2("hii","hlo");
	//System.out.println(l);
	}
	public String methd2(String msg,String s)//methd 1 msg=hii,s=hlo
	{
	System.out.println(msg);
	System.out.println(s);
	return "is";
	//is to methd1

	//String m=aobj.methd3("myself",1);
	//System.out.println(m);
	}
	public String methd3(String a,int c)//methd2 a=myself,c=1
	{
	return "awesome";
	//awesome to methd 2
	
	//String n=aobj.methd4('a',12);
	//System.out.println(n);
	}
	public String methd4(char d,int e)//methd3 d=a,e=12
	{
	return "end";
	}
	public static void main(String args[])
	{
	System.out.println("start");
	ClassZ aobj=new ClassZ();
	String l=aobj.methd2("hii","hlo");
	System.out.println(l);
	String m=aobj.methd3("myself",1);
	System.out.println(m);
	String k=aobj.methd1(10,20);
	System.out.println(k);
	String n=aobj.methd4('a',12);
	System.out.println(n);
	}
	//  java  
	}             



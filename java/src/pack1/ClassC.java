package pack1;

public class ClassC {
	char[] meth1(String []x,int []y)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
		for(int a:y)
		{
			System.out.println(a);
		}
			
	char arr[]= {'a'};
	return arr;
	}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
			String x[]= {"anu","megh","anusha"};
			int y[]= {1,2,3};
			System.out.println(aobj.meth1(x,y));
	}

}

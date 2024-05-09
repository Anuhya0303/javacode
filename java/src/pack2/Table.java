package pack2;

public class Table
{
	public void meth1(int num)
	{
	int i;
	for(i=1;i<=10;i++)
	{
		System.out.println(num + "*" + i + "="+3*i);
	}
	}
	public static void main(String[] args) {
		Table aobj=new Table();
		aobj.meth1(3);
	}
	}


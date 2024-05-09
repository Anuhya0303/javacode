package Training;

public class Pyramid {
	public static void main(String[] args)
	{
		
	
	int i;//rows
	int j;//stars
	int k;//spaces
	int n = 5;//rows
	for (i=1;i<=n;i++) {
		for(k=1;k<=(n-i);k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	

}
}

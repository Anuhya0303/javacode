package pack1;

public class Pattern {
	public static void main (String args[]) {
		for(int i = 3;i>=1;i--)
		{
			for(int j=1;j<=3-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) 
			{
				System.out.print("*");
                				
			}
			System.out.println();
		}
		
	}

}
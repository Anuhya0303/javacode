package Training;

public class NestedIf {
	public static void main(String args[]) {
		int rps = 80;
		if (rps > 50) {
			System.out.println("uh can affoard a iphone.");
		}
		else if(rps == 25) {
			System.out.println("uh can buy a redmi.");
			
		}
		else if(rps == 10) {
			System.out.println("try buying normal nokia set of 10.");
		}
		else
		{
			System.out.println("return home");
		}
	}

}

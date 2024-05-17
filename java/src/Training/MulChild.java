package Training;

public class MulChild extends MulParent{
	public void displaychild() {
		System.out.println("this is child class");
	}
public static void main(String args[]) {
	MulChild c1 = new MulChild();
	c1.displayGrandparent();
	c1.displayParent();
	c1.displaychild();
}
}

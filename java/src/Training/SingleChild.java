package Training;

public class SingleChild extends SingleParent{
public void displaychild() {
	System.out.println("this is child class");
}
public static void main(String args[]) {
	SingleChild s1 = new SingleChild ();
	s1.displayparent();
	s1.displaychild();
}
}

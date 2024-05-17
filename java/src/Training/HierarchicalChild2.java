package Training;

public class HierarchicalChild2 extends HierarchicalParent{
public void displaychild2() {
	System.out.println("this is second child class");
}
public static void main(String args[]) {
	HierarchicalChild2  h1 = new HierarchicalChild2 ();
	h1.parentdisplay();
	h1.displaychild2();
	HierarchicalChild1 h2 = new HierarchicalChild1();
	h2.parentdisplay();
	h2.child1display();
	
}
}

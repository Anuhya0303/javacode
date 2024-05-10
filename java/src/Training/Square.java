package Training;

public class Square extends Rectanglee {
public void meth4() {
	super.meth1();
	System.out.println("Square is a rectangle");
}
public static void main (String args[]) {
	Square aobj = new Square();
	aobj.meth4();
	aobj.meth2();
}
}

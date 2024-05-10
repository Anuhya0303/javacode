package Training;

public class Area1 {
	public void area(int side) {
		System.out.println("area of square: "+ side*side);
	}
public void area(int length,int breadth) {
		System.out.println("area of rectangle: "+ length*breadth);
	}
public static void main (String args[]) {
	Area1 aobj=new Area1();
	aobj.area(4);
	aobj.area(4,6);
}

}

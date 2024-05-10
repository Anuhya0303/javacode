package Training;

public class Shapes {
	public void draw(double radius) {
		System.out.println("area of circle: " + 3.14*radius*radius);
	}
	public void draw(int side) {
		System.out.println("area of square: " + side*side);
	}
	public void draw(int length,int breadth) {
		System.out.println("area of rectengle: "+ length*breadth);
	}
	public static void main(String args[]) {
		Shapes s = new Shapes();
		s.draw(4.2);
		s.draw(4);
		s.draw(4,5);
	}

}

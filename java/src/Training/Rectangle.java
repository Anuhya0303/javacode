package Training;

public class Rectangle {
	double length;
	double breadth;
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth=breadth;
		
	}
	public double area() {
		return  length*breadth;
	}
	public static void main(String args[])
	{
		Rectangle aobj1 = new Rectangle(4,5);
		double area1 = aobj1.area();
		System.out.println("rectangle 1 area:" + area1);
		Rectangle aobj2 = new Rectangle(5,8);
		double area2 = aobj2.area();
		System.out.println("ractangle 2 area:" + area2);
	}
}

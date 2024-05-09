package Training;

public class Area {
	public void area(int side) {
		int area = side * side;
		System.out.println("area of square is" + area);
		
	}
	public void area(int len,int bred) {
		int area = len * bred;
		System.out.println("area of rectangle is" + area);
		
	}
	public static void main(String args[]) {
		Area aobj = new Area();
		aobj.area(10);
		aobj.area(1, 2);
	}
	

}

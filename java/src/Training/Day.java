package Training;

public class Day {
	public void day(String day) {
		if(day == "sunday" || day == "saturday") {
			System.out.println("its weekend");
		}
		else
		{
			System.out.println("its weekday");
		}
	}
	public static void main(String args[]) {
		Day aobj = new Day();
		aobj.day("sunday");
	}

}

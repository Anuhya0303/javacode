package Training;

public class ClassA extends Marks {
	int sub1;
	int sub2;
	int sub3;
	public ClassA(int sub1,int sub2,int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public double getPercentage() {
		return (sub1 + sub2 + sub3)/3;
	}

}

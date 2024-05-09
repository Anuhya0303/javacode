package pack1;

public class Encapsulation {
	private String stuname;
	private int marks;
	private int attendence;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getMarks() {
		if(attendence >= 75)
		return marks+5;
		return marks-10;
	}
	public void setMarks(int marks) {
		
		this.marks = marks;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}


}

package Training;

public class PrintNumber {
	public void print(int id) {
		System.out.println(id);
	}
	public void print(String name) {
		System.out.println(name);
	}
	public void print(char sex) {
		System.out.println(sex);
	}
	public static void main(String args[]) {
		PrintNumber aobj1=new PrintNumber();
		aobj1.print(1001);
		aobj1.print("anuhya");
		aobj1.print('F');
	}

}

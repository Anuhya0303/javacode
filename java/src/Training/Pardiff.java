package Training;

public class Pardiff {
	public void meth1(int i,char c) {
		System.out.println("integer value: " + i + " and char value: " + c);
	}
    public void meth1(char c,int i) {
    	System.out.println("charecter value: " + c + " and integr value: " + i);
    }
    public static void main(String args[]) {
    	Pardiff aobj1 = new Pardiff();
    	aobj1.meth1(1,'A');
    	aobj1.meth1('I', 1);
    		
    	
    }
}

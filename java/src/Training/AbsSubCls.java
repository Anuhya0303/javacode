package Training;

public class AbsSubCls extends AbstractCls {

	public void a_method() {
		System.out.println("This is abstract method");
	}
	public static void main(String args[]) {
		AbsSubCls aobj = new AbsSubCls();
		aobj.a_method();
		aobj.nonabsmeth();
	}
}

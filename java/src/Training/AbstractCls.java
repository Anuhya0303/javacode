package Training;

public abstract class AbstractCls {

	public AbstractCls() {
		System.out.println("this is abstract class constructor");
	}
	public abstract void a_method();
	
	public void nonabsmeth() {
		System.out.println("This is a normal method of abstract class"); 
		
	}
}

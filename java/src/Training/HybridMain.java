package Training;

public class HybridMain {
public static void main(String args[]) {
	HybridLion t = new HybridLion();
	t.eat();
	t.run();
	t.roar();
	System.out.println();
	HybridBird b = new HybridBird();
	b.eat();
	b.fly();
}
}

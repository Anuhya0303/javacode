package Training;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String args[]) {
		
	
	ArrayList A= new ArrayList<>();
	A.add("red sause pasta");
    A.add("pizza");
    System.out.println(A);
    System.out.println(A.size());
    ArrayList foodlist = new ArrayList();
    foodlist.add("wings");
    foodlist.add("chips");
    foodlist.add("fries");
    foodlist.add("nuggets");
    A.addAll(foodlist);
    System.out.println(A);
    System.out.println(A.contains("chips"));
    System.out.println();
    System.out.println();
    System.out.println("traversing the elements of A");
    for(Object food:A) {
    	System.out.println(food);
    }
    A.add(3,"Ice Cream");
    System.out.println(A);
    A.remove(4);
    System.out.println(A);
}
}
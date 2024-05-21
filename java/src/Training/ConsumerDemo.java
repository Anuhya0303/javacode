package Training;
import java.util.function.Consumer;
public class ConsumerDemo {
	public static void main(String args[]){
		
	
	Consumer<String> consumers= ( name)->System.out.println(name.toLowerCase());
     consumers.accept("Anuhya");
     
     Consumer<Integer> consumeri = (engmarks)->System.out.println(engmarks);
     consumeri.accept(10);
     
     Consumer<Integer> consumerii = (matmarks) -> System.out.println(matmarks);
     
     consumeri.andThen(consumerii).accept(100);
}
}

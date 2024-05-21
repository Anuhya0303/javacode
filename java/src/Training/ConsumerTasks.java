package Training;
import java.util.function.Consumer;
import java.util.List;
public class ConsumerTasks {
	public static void main(String args[]) {
		
	
	Consumer<Persons> consumergen = (gen) -> System.out.println(gen.getGender().toUpperCase());
	List<Persons> personsList = PersonRepository.getAllPersons();
	personsList.forEach(consumergen);
	System.out.println();
	
	Consumer <Persons> consumersal = (sal) -> System.out.println(sal.getSalary()+1000);
	personsList.forEach(consumersal);
	}
}

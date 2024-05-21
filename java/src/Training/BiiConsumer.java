package Training;
import java.util.function.BiConsumer;
import java.util.List;
public class BiiConsumer {
	public static void main(String args[]) {
		
	
	BiConsumer<String,String> consumerconcat = (a,b)->System.out.println(a+b);
    consumerconcat.accept("anuhya","pendyala");
    
    BiConsumer<Integer,Integer> consumersub = (a,b) ->System.out.println(a-b);
    consumersub.accept(20,20);
    
    BiConsumer<Integer,Integer> consumeradd = (a,b) ->System.out.println(a+b);
    consumeradd.accept(20,20);
    consumersub.andThen(consumeradd).accept(12,13);
    
    
    
    BiConsumer<Persons,Persons> consumerhs =(sal,hob)->{System.out.println("Salary: " + sal.getSalary());
    System.out.println("Hobbies: " + hob.getHobbies());
    };
    List <Persons> personlist = PersonRepository.getAllPersons();
    personlist.forEach(person -> consumerhs.accept(person, person));
    System.out.println();
    System.out.println();
    System.out.println();
    
    BiConsumer<Persons,Persons> consumerns = (nam,sal)->{System.out.println(nam.getName().toUpperCase());
    System.out.println(sal.getSalary());
    };
    personlist.forEach(person -> consumerns.accept(person, person));
    }
	
	}
    

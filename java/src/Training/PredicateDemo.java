package Training;
import java.util.function.Predicate;
import java.util.List;
public class PredicateDemo {
	public static void main(String args[]) {
		
	
	Predicate<String> lengthgreater = (name)->name.length()>3;
     System.out.println(lengthgreater.test("anuhya"));
     
     Predicate<String> lengthlesser = (name)->name.length()<10;
     System.out.println(lengthlesser.test("meghana"));
     
     System.out.println(lengthgreater.and(lengthlesser).test("irfan"));
     
     
     System.out.println(lengthgreater.or(lengthlesser).test("rio"));
     
     
     Predicate<Persons> femalesal = (personn)->personn.getGender().equals("female") && personn.getSalary()>2000;
   
     List <Persons> personlist = PersonRepository.getAllPersons();
     for (Persons person : personlist) {
         if (femalesal.test(person)) {
             System.out.println(person);
}
}
     
     
	
  /*
   *   Predicate<Persons> salary = (sall)->sall.getSalary()>2000;
   
     System.out.println();
     System.out.println();
     
     for (Persons person : personlist) {
         if (salary.test(person)) {
             System.out.println(person);
             
             System.out.println("********************************");
             
             
}

     }
     */
	}
}
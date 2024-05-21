package Training;
import java.util.*;

public class RemoveDup {
	public class RemoveDuplicates {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Sam", "Peter", "ballon", "Sam");
	        
	        // Convert list to set to remove duplicates
	        Set<String> uniqueNames = new LinkedHashSet<>(names);
	        
	        // Convert set back to list (if needed)
	        List<String> uniqueNamesList = new ArrayList<>(uniqueNames);
	        
	        System.out.println("List with duplicates removed: " + uniqueNamesList);
	    }

}
}

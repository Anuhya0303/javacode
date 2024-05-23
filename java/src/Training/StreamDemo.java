package Training;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamDemo {
	public static void main(String args[]) {
		
	
	List<String> names = Arrays.asList("Sam", "Peter", "ballon", "Sam");
	long count =names.stream()
			.filter(name->name.length()>3)
			.count();
	System.out.println(count);
	
	// write a logic to convert all the datas in a list to uppercase
	List<String> uppercase =names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	System.out.println(uppercase);
	
	List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", "", "delhi", "chicago");
	//cities to uppercase
	List<String> CityUpper = cityList.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	System.out.println(CityUpper);
	//cities length greater than 3
	List<String> lengthGretaer3 = cityList.stream()
			.filter(name->name.length()>6)
			.collect(Collectors.toList());
	System.out.println(lengthGretaer3);
	 //filter the cities that starts with c
	List<String> cityStartsWithC = cityList.stream()
			.filter(name->name.startsWith("c"))
			.collect(Collectors.toList());
	System.out.println(cityStartsWithC);
	//print the cities that contains "ai"
 	List<String> Containsai = cityList.stream()
 			.filter(name->name.contains("ai"))
 			.collect(Collectors.toList());
 	System.out.println(Containsai);
 	//append  the word "metro" to all the cities (hint: manipulation )
	List<String> addMetro = cityList.stream()
			.map(name->name +"metro")
			.collect(Collectors.toList());
	System.out.println(addMetro);
	//count how many cities start with c  (hint:use terminal operation:count)
	long counts = cityList.stream()
			.filter(name->name.startsWith("c"))
			.count();
	System.out.println(counts);
	//count the empty string  (hint:use terminal operation:count)
	long emptystrings = cityList.stream()
			.filter(name->name.isEmpty())
			.count();
	System.out.println(emptystrings);
	//remove all empty string from list
	 List<String> nonEmptyCities = cityList.stream()
             .filter(city -> !city.isEmpty())
             .collect(Collectors.toList());
	 System.out.println(nonEmptyCities);
	}
}	

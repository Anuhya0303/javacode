package Training;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class PersonRepository {
	public static List<Persons> getAllPersons() {
		Persons p1 = new Persons("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Persons p2 = new Persons("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
		Persons p3 = new Persons("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"));
		Persons p4 = new Persons("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Persons p5 = new Persons("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
		Persons p6 = new Persons("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Persons p7 = new Persons("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));

		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}

	public static Persons getPerson() {
		return new Persons("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
	}

	public static Optional<Persons> getPersonOptional() {
		Persons per = getPerson();
		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
		return Optional.of(per);
	}

}

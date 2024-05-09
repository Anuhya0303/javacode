package Training;

public class Students {
	String name;
	int age;
	String address;
	
	public Students() {
		this.name = "unknown";
		this.age=0;
		this.address="not available";
	}
	public void setinfo(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public void setinfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
		System.out.println();
	}
	public static void main(String[] args) {
		Students[] students = new Students[10];
		for (int i = 0; i < 10; i++) {
            students[i] = new Students();
        }
		// Set information for each student
        students[0].setinfo("Anuhya", 20, "khammam");
        students[1].setinfo("Shekar",44, "Khammam");
        students[2].setinfo("sirisha", 38, "khammam");
        // Set information using the setInfo method with two parameters
        students[3].setinfo("meghana", 50);
        students[4].setinfo("irfan", 24);
        students[5].setinfo("Anu", 25);
        // Set information using the setInfo method with three parameters
        students[6].setinfo("asma", 26, "Janagam");
        students[7].setinfo("anusha", 27, "Hanamkonda");
        students[8].setinfo("sarika", 28, "Begumpet");
        students[9].setinfo("ammu", 29, "Hyderabad");

        // Print information of all students
        for (int i = 0; i < 10; i++) {
            students[i].printInfo();
        }
	}
		
	}



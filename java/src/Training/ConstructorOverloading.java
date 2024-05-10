package Training;

public class ConstructorOverloading {
String name;
int age;
double sal;
		public  ConstructorOverloading(){
			name = "anuhya";
			age = 21;
			sal = 350000;
		}
		
		public ConstructorOverloading(String name) {
			this.name=name;
			System.out.println(name);
		}
		
		public ConstructorOverloading(String name,int age) {
			this.name=name;
			this.age=age;
			System.out.println(name + age);
		}
		public ConstructorOverloading(String name,int age,double sal) {
			this.name=name;
			this.age=age;
			this.sal=sal;
			System.out.println(name + age + sal);
			
		}
		public static void main(String args[]) {
			new ConstructorOverloading();
			new ConstructorOverloading("anuhya");
			new ConstructorOverloading("meghana",22);
			new ConstructorOverloading("irfan",24,350000);
		}
	}



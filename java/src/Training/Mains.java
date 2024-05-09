package Training;

public class Mains {
	public static void main(String args[]) {
		Employe aobj1 = new Employe();
		aobj1.name ="anuhya";
		aobj1.age=21;
		aobj1.phonenumber="123";
		aobj1.address="hyd";
		aobj1.salary=2000000;
		aobj1. specialization="java developer";
		System.out.println("employee details");
		System.out.println("employee:" + aobj1.name);
		System.out.println("employee age:" + aobj1.age);
		System.out.println("employee phoneNumber:" + aobj1.phonenumber);
		System.out.println("employee address:" + aobj1.address);
	    aobj1.printsalary();
		System.out.println("employee specialization:" + aobj1. specialization);
		
		System.out.println();
		System.out.println();
		System.out.println();
		Manager aobj2 = new Manager();
		aobj2.name ="Irfan";
		aobj2.age=24;
		aobj2.phonenumber="321";
		aobj2.address="uppal";
		aobj2.salary=3000000;
		aobj2.department="senior AR";	
		aobj2.printsalary();
		System.out.println("manager details");
		System.out.println("manager name:" + aobj2.name);
		System.out.println("manager age:" + aobj2.age);
		System.out.println("manager phoneNumber:" + aobj2.phonenumber);
		System.out.println("manager address:" + aobj2.address);
		System.out.println("manager department:" + aobj2. department);
		aobj2.printsalary();
	}

}

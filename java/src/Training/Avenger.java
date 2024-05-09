package Training;

public class Avenger {
	 private String name;

	    public Avenger(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        Avenger hulk = new Avenger("Hulk");
	        Avenger ironman = new Avenger("Ironman");

	        System.out.println("Name of Hulk: " + hulk.getName());
	        System.out.println("Name of Ironman: " + ironman.getName());
	    }

}

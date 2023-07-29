package SetterPackage;

public class Coder {
	private  String language;
	private String name;
	private int id;
	private Computer computer;
	public Coder() {
		super();
		System.out.println("No arg in this Constructor(setter)");
	}

	
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

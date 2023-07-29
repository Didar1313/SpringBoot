package SetterPackage;

public class Computer {
	private String brand;

	public Computer() {
		super();
		System.out.println("No arg in this Computer(setter)");

	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}

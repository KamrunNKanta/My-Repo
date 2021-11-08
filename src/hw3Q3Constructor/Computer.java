package hw3Q3Constructor;

public class Computer {

	public String MyBrand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeinUsa;
	// default constructor

	public Computer() {
		System.out.println("This is a default constructor from Computer class");

	}

	// Paramitarized constructor
	public Computer(String MyBrand, String Model, String OperatingSystem, int price, char grade, boolean madeinUsa) {
		this.MyBrand = MyBrand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeinUsa = madeinUsa;
		System.out.println("MY Brand is " + MyBrand + "Model is" + Model + "OS is " + OperatingSystem + "Price" + price
				+ "Grade is" + grade + "IS it Made in USa" + madeinUsa);
	}

	public Computer(String MyBrand, int price, boolean madeinUsa) {
		this.MyBrand = MyBrand;
		this.price = price;
		this.madeinUsa = madeinUsa;
		System.out.println("MyBrand" + MyBrand + "Price is " + price + "Made in Usa " + madeinUsa);

	}

	public Computer(String MyBrand, String Model, String OperatingSystem, int price, char grade) {
		this.MyBrand = MyBrand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		System.out.println("My brand is" + MyBrand + "Model is" + Model + "Oprating system" + OperatingSystem
				+ "Price is" + price + "Grade is " + grade);

	}

}

package hw3Q2variableAndMethod;

public class Computer {
	public String MyBrand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeinUsa;

	public void configuration() {
		System.out.println(MyBrand + Model + OperatingSystem + price + grade + madeinUsa);
	}

}

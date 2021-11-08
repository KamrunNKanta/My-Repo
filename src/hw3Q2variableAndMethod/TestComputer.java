package hw3Q2variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer computerobj = new Computer();
		computerobj.MyBrand = "Apple";
		computerobj.Model = "MacBook Air";
		computerobj.OperatingSystem = "MacOs Mojava";
		computerobj.price = 800;
		computerobj.grade = 'C';
		computerobj.madeinUsa = false;

		computerobj.configuration();

		Computer computerobj2 = new Computer();
		computerobj2.MyBrand = "HP";
		computerobj2.Model = "HP envy 360";
		computerobj2.OperatingSystem = "Windows";
		computerobj2.price = 600;
		computerobj2.grade = 'B';
		computerobj2.madeinUsa = true;

		computerobj2.configuration();
	}

}

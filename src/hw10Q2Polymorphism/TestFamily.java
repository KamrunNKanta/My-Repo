package hw10Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("------Sister class methods-----");

		Sister sis = new Sister();
		sis.sister(10);// final type method
		sis.sister(7, 1, "99");// parameterized method
		sis.sister(35, 78, 7, 3, 6);// void type method
		sis.sister(23, 56, 9, 11);// return type method
		Sister.sister(66, 88);// Static method

		System.out.println("------Niece class methods-----");
		Niece nie = new Niece();
		nie.sister(99, 1000, "87");
		nie.sister(5, 4, 70, 20, 330);
		nie.sister(7, 1, 7, 1);
	}

}

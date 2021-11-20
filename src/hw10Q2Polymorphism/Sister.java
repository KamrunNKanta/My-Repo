package hw10Q2Polymorphism;

public class Sister {

	// void type method
	public void sister(int age1, int age2, int age3, int age5, int age6) {
		int total1 = age1 + age2 + age3 + age5 + age6;
		System.out.println("This is a void method from Sister class" + total1);
	}
	// return Type parameterized method

	public int sister(int age1, int age2, String age4) {
		int tota2 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("This is  parameterized method" + tota2);
		return tota2;
	}

	// return type method
	public int sister(int age2, int age3, int age5, int age6) {
		int total3 = age2 + age3 + age5 + age6;
		System.out.println("This is a return type method" + total3);
		return total3;
	}

	// Static type method
	public static int sister(int age2, int age3) {
		int total4 = age2 + age3;
		System.out.println("This is a static method" + total4);
		return total4;

	}

	// final type method
	public final int sister(int age1) {
		int total5 = age1;
		System.out.println("Final type method" + total5);
		return total5;
	}
	/*
	 * method overloading: same method name,but different type of
	 * parameter/signature combination its also called Early binding or static
	 * binding or compile time polymorphism it occours in compilr time,allows static
	 * and final methods.
	 */

}

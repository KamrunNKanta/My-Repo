package hw10Q2Polymorphism;

public class Niece extends Sister {
	@Override
	public void sister(int age1, int age2, int age3, int age5, int age6) {
		int total1 = age1 + age2 + age3 + age5 + age6;
		System.out.println("This is a void method from Sister class" + total1);
	}

	@Override

	public int sister(int age1, int age2, String age4) {
		int tota2 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("This is  parameterized method" + tota2);
		return tota2;
	}

	@Override
	public int sister(int age2, int age3, int age5, int age6) {
		int total3 = age2 + age3 + age5 + age6;
		System.out.println("This is a return type method" + total3);
		return total3;
	}

	/*
	 * @Override-cannot override it because it is a static method public static int
	 * sister(int age2, int age3) { int total4 = age2 + age3;
	 * System.out.println("This is a static method" + total4); return total4;
	 * 
	 * }
	 */
	/*
	 * @Override-cannot override it because final type method
	 * 
	 * public final int sister(int age1) { int total5 = age1;
	 * System.out.println("Final type method" + total5); return total5; }
	 */
	/*
	 * method overriding Ans: Same method name, same parameter but different syntax
	 * or logic is called method overriding its also called,Late binding or dynamic
	 * binding or runtime polymorphism
	 */

}

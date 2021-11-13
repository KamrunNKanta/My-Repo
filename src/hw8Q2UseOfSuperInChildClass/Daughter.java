package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {/*
						 * Create a class name 'Daughter', declare variable birthMonth, age. Declare
						 * default (declare a sysout inside it) and parameterized constructor (declare a
						 * sysout inside it), and implement a regular method daughter() and declare a
						 * sysout. Create a parameterized method daughterInfo() which contains 2 of its
						 * variables as local variable. declare a sysout (you can copy from
						 * parameterized constructor) . Daughter extends Father (super class). Use super
						 * method, super keyword and show all of their use in child class. and
						 * initialize in a TestFamily Class
						 * 
						 */
	String birthMonth;
	int age;

	// default constructor
	public Daughter() {
		super();
		System.out.println("super keyword use in Daughter class default constructor");

	}

	// parameterized constructor
	public Daughter(String birthMonth, int age)

	{super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Super keyword use in paramitarized constructor in daughter class");
		System.out.println("BirthMonth is " + birthMonth + "age" + age);
	}
	// void type or no return method or non parameterized method
	public void daughter() {
		super.age=55;
		super.FamilyName="Prang";
		super.Name="MA KAyume";
		super.usCitizen=false;
		super.fatherInfo("Kayume", 55, "Male", false);
				
		System.out.println("This a void method where i use super method");

	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is Paramiterized method where i use super method");
		System.out.println("BirthMonth is " + birthMonth + "age" + age);

	}

}

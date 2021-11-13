package hw8Q2UseOfSuperInChildClass;



public class Father {
	/*
	 * a) Create a class name Father. declare 5 variable like Name, age, sex,
	 * usCitizen, FamilyName. Declare default (declare a sysout inside it) and
	 * parameterized constructor (declare a sysout inside it) from the first 4
	 * variables. Use 'FamilyName' variable to initialize by super keyword in child
	 * class. Create a regular void type method name father() which is implemented,
	 * declare a sysout inside it. Create a parameterized method fatherInfo() which
	 * also contain it's 4 variables, declare a sysout (you can copy from
	 * parameterized constructor)
	 */
	String Name;
	int age;
	String sex;
	Boolean usCitizen;
	String FamilyName;

//default constructor
	public Father() {
		System.out.println("This is a default constructor from father class");
	}
//Parameterized constructor

	public Father(String Name, int age, String sex, Boolean usCitizen) {

		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println(
				"FAther name is  :" + Name + "Sex is :" + sex + "His Age is " + age + "is he Us Citizen" + usCitizen);

	}

	public void father() {
		System.out.println("This is a void method");

	}

	public void fatherInfo(String Name,int age, String sex, Boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println(
				"FAther name is  :" + Name + "Sex is :" + sex + "His Age is " + age + "is he Us Citizen" + usCitizen);
	}
}
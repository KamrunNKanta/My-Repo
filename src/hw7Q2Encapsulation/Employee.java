package hw7Q2Encapsulation;

public class Employee {
	/*
	 * Create a package name "hw7Q2Encapsulation" in the HW project. Inside the
	 * package, a) Create a class, Employee. declare some private variables---->
	 * name, age, sex, usCitizen. How can you access those variables by getter and
	 * setter method? Please execute those variables and print Employee info. Paste
	 * the GitHub link below.
	 */
	private String name;
	private int age;
	private boolean usCitizen;

	public void employeeInfo() {
		System.out.println(" Employee name :" + name + "Age :" + age + "Is he Us citizen" + usCitizen);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}

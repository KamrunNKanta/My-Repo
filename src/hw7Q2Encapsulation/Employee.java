package hw7Q2Encapsulation;

public class Employee {
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

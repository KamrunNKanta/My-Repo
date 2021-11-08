package hw3Q4Constructor;

public class Student {
	String StName;
	int stID;
	char sex;
	boolean programmer;
	float grade;

	// default constructor
	public Student() {
		System.out.println("This is a default constructor from Student class");
	}

	// paramitarized constructor
	public Student(String StName, int stID, char sex, boolean programmer, float grade) {

		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("This is the paramitarized constructor from Student class which contains" + "Student Name :"
				+ StName + "Student id :" + stID + "Sex :" + sex + "Are you a Programmer :" + programmer
				+ "Students grade" + grade);

	}

	// paramitarized method
	public void student(String StName, int stID, char sex, boolean programmer, float grade) {
		System.out.println("This is a paramitarized method");
	}

}


public class Student {

	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	// declaring default constructor
	public Student() {
		System.out.println("This is a default constructor from Student class");
	}

	// declaring paramitarized constructor
	public Student(String StName, int stID, char sex, float grade, boolean programmer) {
		this.StName = StName;
		this.stID = stID;
		this.sex = sex;

		this.grade = grade;
		this.programmer = programmer;
		System.out.println("Student name is :" + StName + "Student id is " + stID + "Sex :" + sex
				+ "Are ypu a programmer" + programmer + "Student grade is" + grade);

	}

// paramitarized method initialized
	public void student(String StName, int stID, char sex, float grade, boolean programmer) {
		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;

		System.out.println("Student name is :" + StName + "Student id is " + stID + "Sex :" + sex
				+ "Are ypu a programmer" + programmer + "Student grade is" + grade);
	}

}

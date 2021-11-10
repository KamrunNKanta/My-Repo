package hw7Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Kanta");
		employee.setAge(31);
		employee.setUsCitizen(false);

		employee.employeeInfo();
	}

}

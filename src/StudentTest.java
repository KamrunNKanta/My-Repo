
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Kanta", 1, 'F', 3.976f, true);
		Student student2 = new Student();
		// paramitarized method
		student2.student("Kanta", 3, 'k', 6.896f, false);

	}

}

package hw7Q2Encapsulation;

public interface University {
	/*how many keywords are used for the inheritance in Interface, answer by Java comments
	Answer:One ,extends keywords
	Can an interface inherit other Interface, or a regular class or abstract class? 
	yes ,Interface can inherit an interface.but can't inherit regular class or abstract class
	How many inheritance is possible
	Multiple interface to interface inheritance possible?*/
	public void classSize();

	public void playGround();

	public void teacher();

	// Cannot t create a constructor,showing error,because for a default contructor
	// you
	// have to have a class,not a interface.constructor has a same name of class
	default void gymnasium() {

	}

	public static void library() {
	}

}

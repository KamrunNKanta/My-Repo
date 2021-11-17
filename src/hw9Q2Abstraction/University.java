package hw9Q2Abstraction;

public interface University extends College,Hospital{

	/*
	 * 3-1) Copy your previous package "hw6Q3Abstraction" and rename it to
	 * "hw7Q3Abstraction" inside your HW project and execute the below in
	 * hw7Q3Abstraction package. Read the question very carefully. Create one
	 * default and one static method gymnasium and library inside interface
	 * "University".
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 3-2)how many keywords are used for the inheritance in Interface, answer by
	 * Java comments Answer:One ,extends keywords Can an interface inherit other
	 * Interface, or a regular class or abstract class? yes ,Interface can inherit
	 * an interface.but can't inherit regular class or abstract class How many
	 * inheritance is possible??Ans: Multiple interface to interface inheritance
	 * possible.
	 * 
	 * 
	 * 
	 * 3-1) i) Total how many keywords are used for the inheritance in Interface,
	 * answer by Java comments? Can an interface inherit other Interfaces, or a
	 * regular class or abstract class by extends or implements keyword? 
	 * Ans:An interface can inherit multiple interface by extends keywords not a regular class or abstract class
	 * How many
	 * inheritance is possible? Ans-Multiple
	 * Use the Interface -- "University" to answer my
	 * questions (University extends College, Hospital) (by multiple line comments).
	 */
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

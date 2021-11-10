package hw7Q2Encapsulation;

public abstract class MedicalSchool{
	/*
	 * how many keywords are used for the inheritance in Java for Abstract Class?
	 * Ans:one ,extends keyword
	 * Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface? 
	 * Ans:yes An Abstract class  can inherit  Abstract class,regular class not an interface
	 * How many inheritances is possible by an Abstract Class?
	 * Answer:only one
	 *  Use the
	 * all of above Abstract Classes and use the keywords to answer my questions
	 * 
	 */
	// Abstract Method

	public abstract void anatomyLab();

	// non Abstract Method
	public void biochemistryLab() {
		System.out.println("This is non Abstract Method");
	}

}

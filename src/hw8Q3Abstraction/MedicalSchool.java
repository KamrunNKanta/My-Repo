package hw8Q3Abstraction;

/* Use one of above Abstract Class (MedicalSchool
* extends NursingSchool)*/
public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	public MedicalSchool() {
	}
	/*
	 * You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? Can an Abstract Class inherit other Abstract Class or a
	 * regular class or interface by extends keyword? How many inheritances is
	 * possible by an Abstract Class? Use one of above Abstract Class (MedicalSchool
	 * extends NursingSchool) and use the keywords to answer my questions
	 */

	/*
	 * how many keywords are used for the inheritance in Java for Abstract Class?
	 * Ans:one ,extends keyword Can an Abstract Class inherit other Abstract Class
	 * or a regular class or interface? Ans:yes An Abstract class can inherit
	 * Abstract class,regular class not an interface How many inheritances is
	 * possible by an Abstract Class? Answer:only one Use the all of above Abstract
	 * Classes and use the keywords to answer my questions Ans: i used the extends
	 * keywords for another classes before answering
	 *
	 *
	 *
	 *
	 *
	 * You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? two-extends and implements Can an Abstract Class inherit
	 * other Abstract Class or a regular class or interface by extends or implements
	 * keyword? Ans:yes,extends keyword for Abstract class to Abstract class and
	 * regular class.and implements keyword for interface.
	 *  How many inheritances is
	 * possible by an Abstract Class?Ans:one using extends ,multiple using implements 
	 * Use one of above Abstract Class (MedicalSchool
	 * extends NursingSchool implements LawSchool) and use the keywords to answer my
	 * questions.
	 * 
	 */
	// Abstract Method

	public abstract void anatomyLab();

	// non Abstract Method
	public void biochemistryLab() {
		System.out.println("This is non Abstract Method");
	}

}

package hw7Q3Abstraction;

import hw8Q3Abstraction.LawSchool;

/* Use one of above Abstract Class (MedicalSchool
* extends NursingSchool)*/
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {
	}
	/*
	 * 3-2) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? Ans:2 ,extends and implements
	 * Can an Abstract Class inherit other Abstract Class or a
	 * regular class or interface by extends or implements keyword?
	 * 
	 * Ans:Yes an Abstract class can inherit Abstract class and Regular classs using extends kewyord,
	 * for interface implements keyword used.
	 *  How many
	 * inheritances is possible by an Abstract Class?Ans:with extends keyword one abstract /regular class
	 * with implements multiple interface 
	 * 
	 *  
	 *  
	 *  Use one of above Abstract
	 * Class (MedicalSchool extends NursingSchool implements LawSchool) and use the
	 * keywords to answer my questions.
	 * 
	 * 
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
	 */
	// Abstract Method

	public abstract void anatomyLab();

	// non Abstract Method
	public void biochemistryLab() {
		System.out.println("This is non Abstract Method");
	}

}

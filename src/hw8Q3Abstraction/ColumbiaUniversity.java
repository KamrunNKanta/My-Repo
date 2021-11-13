package hw8Q3Abstraction;

public class ColumbiaUniversity extends EngineeringSchool implements  University {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class?Ans :One extends
	 * 
	 *  Can a regular Class inherit other Abstract Class or a
	 * regular class or interface by extends or implements keyword?
	 * Ans:yes,extends keyword used for Regular class to regular class and abstract class
	 * implements used for regular class to interface
	 * 
	 *  How many
	 * inheritances is possible by a regular Class? 
	 * Ans:One  regular/Abstract class using extends keyword
	 * and using implements multiple interface.
	 * Use one of above regular Classes
	 * (ColumbiaUniversity extends MedicalSchool implements University,
	 * VocationalSchool) and use the keywords to answer my questions. Abstract
	 * method //public abstract void chemistry(); //non abstract method
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void biology() {
		System.out.println("This is impleminted or non abstract method ");
	}

//default constructor can created
	public ColumbiaUniversity() {
	}

	@Override
	public void mechanicalLab() {
		System.out.println("Carring an abstract methods from Enginnering school abstract class");
	}

	@Override
	public void commonRoom() {
		System.out.println("Coming from college interface");
		
	}

	@Override
	public void laboratory() {
		System.out.println("Coming from college interface");
		
		
	}

	@Override
	public void languageClub() {
		System.out.println("Coming from college interface");
		
		
	}

	@Override
	public void emergencyRoom() {
		System.out.println("Coming from college interface");
		
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("Coming from Hospital interface");
		
		
	}

	@Override
	public void cafeteria() {
		System.out.println("Coming from Hospital interface");
		
	}

	@Override
	public void classSize() {
		System.out.println("Coming from University interface");
	}

	@Override
	public void playGround() {
		System.out.println("Coming from University interface");
		
	}

	@Override
	public void teacher() {
		System.out.println("Coming from University interface");
	}

}

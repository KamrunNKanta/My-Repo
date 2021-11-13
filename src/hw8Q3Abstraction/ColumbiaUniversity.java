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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

}

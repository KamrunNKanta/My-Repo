package hw9Q2Abstraction;
//EngineeringSchool extends NYUniversity
public abstract class EngineeringSchool  extends NYUniversity{
	// Abstract method
	public abstract void mechanicalLab();

	// non Abstract method
	public void computerLab() {
		System.out.println("this is a non abstract method from engeneering school class");}

	//can create constructor of Abstract class
public EngineeringSchool() {
	
}

}

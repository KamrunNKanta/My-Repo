package hw9Q2Abstraction;
//RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool
public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
	// Abstract method
	// public abstract void math();
	// non anstract method

	public void statistics() {
		System.out.println("Hello");

	}

//default constructor
	public RockefellerUniversity() {
	}

@Override
public void aeronauticalInfo() {
	System.out.println("Coming from AeronaticalSchool interface");
	
}

@Override
public void mechanicalLab() {
	System.out.println("Coming from EngineeringSchool Abstract class");
	
	
}
}

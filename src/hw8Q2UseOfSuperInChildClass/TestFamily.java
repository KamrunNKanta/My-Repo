package hw8Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		//default constructor initialize from father class
		Father father=new Father();
		//parametarized constructor initialized  from father class
		Father father01=new Father("Ma Kayume",55,"Male",false);
		//void type method initialized from Father class
		father01.father();
		//parametarized method initialized from Father class
		System.out.println("\n---------- parameterized method initialized from Father  Class ----------");
		father01.fatherInfo("jamal", 85, "Male",false);
		
		Daughter daughter=new Daughter();
		Daughter daughter2=new Daughter("October",31);
		daughter2.daughter();
		daughter2.daughterInfo("july", 3);
		

	}

}

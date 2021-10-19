package hw2Q2JavaVariables;

public class TestAboutUS {

	public static void main(String[] args) {
		//instantiate AboutUs class under main method
		// constructor is initialized and declared
		AboutUs object = new AboutUs();
		// variables are initialized and declared for me
		object.MyName = "Kanta";
		object.myHouseNumber = 677;
		object.myAge = 31;
		object.myHeight = 6.6f;
		object.myBankBalance = 560000;
		object.myGrade = 4.75;
		object.myHouseMortatge = 1800;
		object.mySex = 'F';
		object.usCitizen = false;
		// variable are declared for my friend Alex
		AboutUs alex = new AboutUs();
		alex.MyName = "Alex";
		alex.myHouseNumber = 555;
		alex.myAge = 40;
		alex.myBankBalance = 78800000;
		alex.myHeight = 7.78f;
		alex.myGrade = 6.75;
		alex.mySex = 'M';
		alex.usCitizen = true;
		alex.myHouseMortatge = 4500;

		// call the method by object /method initialized

		object.aboutUs();

	//	alex.aboutUs();

	}

}

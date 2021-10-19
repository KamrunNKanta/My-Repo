package hw2Q2JavaVariables;

public class AboutUs {
	//varriablr declared
	public String MyName;
	public int myHouseNumber;
	public char mySex ;
	public boolean usCitizen;
	public byte myAge;
	public short myHouseMortatge ;
	public long myBankBalance ;
	public float myHeight ;
	public double myGrade ;

	// constructor is declared
	public AboutUs() {
		System.out.println("This is all about me");

	}

	// method
	public void aboutUs() {
		System.out.println("My Name is  :" + MyName + "\nMy HouseNumber is :" + myHouseNumber + "\nMy Sex :" + mySex
				+ "I am a Uscityzen :" + usCitizen + "\nMy Age is : " + myAge + "MY house mortatage is :  "
				+ myHouseMortatge + "My Bankbalance is  : " + myBankBalance + "My grade is :" + myGrade);
	}

	public static void main(String[] args) {

	}

}

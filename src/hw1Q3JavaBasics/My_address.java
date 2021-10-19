package hw1Q3JavaBasics;

public class My_address {
	
	public static String My_name = "Kamrun Kanta";
	public static int my_Age= 31;
	public static String StreetName = "Dickens Drive";
	public static char houseLocation = 'W';
	public static boolean inUSA = true;

	public static void my_address() {
		System.out.println(My_name + "\n" + my_Age + " " + StreetName + " " + houseLocation + " " + inUSA);

	}

	public static void main(String[] args) {
		my_address();

	}
}
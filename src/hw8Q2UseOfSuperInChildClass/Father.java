package hw8Q2UseOfSuperInChildClass;

public class Father {
	String Name;
	int sex;
	Boolean usCitizen;
	String FamilyName;

//default constructor
	public Father() {
		System.out.println("This is a default constructor from father class");
	}
//Parameterized constructor

	public Father(String name, int sex, Boolean usCitizen,String FamilyName) {
		super();
		Name = name;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.FamilyName=FamilyName;
		System.out.println("FAther name is  :"+name+"Sex is :" + "is he Us Citizen"+usCitizen+"Family Name is :"+ FamilyName);
		
	}
}
package hw9Q2Abstraction;

public class TestInstitute {
	// Then Instantiate ColumbiaUniversity , University and MedicalSchool one by
	// one. Call all the possible methods from the object of ColumbiaUniversity ,
	// University and MedicalSchool. Make sure you execute the static methods from
	// ColumbiaUniversity , University and MedicalSchool (if not created, please
	// create one). Try to create default method (public default void
	// ...........[follow the format of default method from interface]) in regular
	// class and abstract class if possible and execute them if possible.

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.gymnasium();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.lawInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.morgue();
		columbiaUniversity.physics();
		columbiaUniversity.playGround();
		columbiaUniversity.statistics();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationallInfo();
		ColumbiaUniversity.universityEducation();// here i am calling a static method

		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.languageClub();
		university.morgue();
		university.playGround();
		university.surgeryRoom();
		university.teacher();
		University.library();// here i am calling the static method

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.caring();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.physics();
		medicalSchool.statistics();
		MedicalSchool.medicalClass();// here i am calling the static method

	}
}
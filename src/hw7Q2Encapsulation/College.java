package hw7Q2Encapsulation;

public interface College extends School, University, House{
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {
	}

	public static void studyRoom() {
	}
}

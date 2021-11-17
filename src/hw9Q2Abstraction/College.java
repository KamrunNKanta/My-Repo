package hw9Q2Abstraction;

public interface College {
	/*3-1)
	 * Create also one default and one static method dorm and studyRoom inside
	 * interface "College".
	 */
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {
	}

	public static void studyRoom() {
	}
}

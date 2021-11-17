package hw9Q2Abstraction;

public interface Hospital {
	/*3-1) 
	 * Create one default and one static method morgue and pharmacy inside interface
	 * "Hospital"
	 */
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	default void morgue() {
	}

	public static void pharmacy() {
	}
}

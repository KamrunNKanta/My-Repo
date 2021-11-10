package hw7Q2Encapsulation;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	default void morgue() {
	}

	public static void pharmacy() {
	}
}

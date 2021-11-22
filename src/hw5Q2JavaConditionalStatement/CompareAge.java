package hw5Q2JavaConditionalStatement;

public class CompareAge {

	public static void main(String[] args) {
		int ageOfAlex = 21;
		int ageOfJenifer = 21;
		if (ageOfAlex % 2 == 0 && (ageOfAlex < ageOfJenifer)) {
			System.out.println("Alex is " + ageOfAlex + "which is an even number and he is younger than Jenifer. "
					+ ageOfJenifer + " the age of Jenifer.");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex > ageOfJenifer)) {

			System.out.println(
					"Alex is 21, which is an even number" + " and he is older than Jenifer. 21, " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex < ageOfJenifer)) {
			System.out.println(" Alex is 21, which is an odd number and he is younger than Jenifer. 21" + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex > ageOfJenifer)) {
			System.out.println("Alex is 21, which is an odd number and he is older than" + "Jenifer 21" + ageOfJenifer);

		} else if (ageOfAlex % 2 == 0 && (ageOfAlex != ageOfJenifer)) {
			System.out.println(" Alex is 21, which is an even number and they are not same\r\n"
					+ "							 * age. 21, the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer)) {
			System.out.println(" Alex is 21, which is an even number and they are  same\r\n"
					+ "							 * age. 21," + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex != ageOfJenifer)) {
			System.out.println("Alex is 21, which is an odd number and they are not the same age. 21,\r\n"
					+ "							 * the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex != ageOfJenifer)) {
			System.out.println("Alex is 21,\r\n"
					+ "							 * which is not an even number and they are not the same age. 21, the age of\r\n"
					+ "							 * Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex >= ageOfJenifer)) {
			System.out.println(" 9) Alex is 21, which is an even number and they are the same age or\r\n"
					+ "							 * (Alex may be older). 21, the age of Jenifer.");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex == ageOfJenifer) || (ageOfAlex < ageOfJenifer)) {
			System.out.println(" Alex is 21, which is an even\r\n"
					+ "							 * number and they are the same age or (Alex may be younger). 21, the age of\r\n"
					+ "							 * Jenifer");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex == ageOfJenifer)) {
			System.out.println("Alex is 21, which is an odd number and they are the same age.\r\n"
					+ "							 * 21, the age of Jenifer");

		}

	}

}

package hw5Q2JavaConditionalStatement;

public class CompareAge {/*
							 *  6) Alex is 21, which is an even number and they
							 * are the same age. 21, the age of Jenifer. 7) Alex is 21, which is an odd
							 * number and they are not the same age. 21, the age of Jenifer. 8) [use logical
							 * not operator !, for this] Alex is 21, which is not an even number and they
							 * are not the same age. 21, the age of Jenifer. 9) Alex is 21, which is an even
							 * number and they are the same age or (Alex may be older). 21, the age of
							 * Jenifer. 10) Alex is 21, which is an even number and they are the same age or
							 * (Alex may be younger). 21, the age of Jenifer. 11) Alex is 21, which is an
							 * odd number and they are the same age. 21, the age of Jenifer. Organize the
							 * code, paste the code below if your hw folder is not connected to github. If
							 * connected, share the package link (url) below.
							 */

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
		}
		else if (ageOfAlex%2 ==1 &&(ageOfAlex > ageOfJenifer )) {System.out.println("Alex is 21, which is an odd number and he is older than"+
							 "Jenifer 21" + ageOfJenifer);
			
		}else if(ageOfAlex%2 ==0 && (ageOfAlex!=ageOfJenifer)) {System.out.println(" Alex is 21, which is an even number and they are not same\r\n"
				+ "							 * age. 21, the age of Jenifer");
			
		}else if(ageOfAlex%2==

	}

}

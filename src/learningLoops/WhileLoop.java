package learningLoops;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * int i=0; while (i<=10) { System.out.println(i); System.out.println("******");
		 * i++; }
		 */
		  //do while loop
		    int j=2; do{ System.out.println(j);
		  j++; }
		    while (j>=5);
		 
		/* //nested while loop inside a for loop for (int k=1;k<=6;k+=2) {//1,3,5 int l
		 * =2; while(l<=3)//2,3
		 * 
		 * System.out.println(k+l); l++;}
		 *
		// java continue use:when we say continue we skip that condition and continue
		// the loop*/
		for (int i = 1; i <= 5; i++) {
			if (i == 2) {//
			continue;
			}
			System.out.println(i);
		}

	}
}


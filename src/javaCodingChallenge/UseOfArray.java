package javaCodingChallenge;

public class UseOfArray {

	public static void main(String[] args) {
		// here int = type of variable, ar = name of the Array
				// int [5]= there are 5 int type variable
		
		int[]ar=new int [5];
		ar[1]=67;
		ar[2]=54;
		System.out.println(ar.length);
		System.out.println(ar[1]);
		System.out.println(ar[4]);
		// Other way to represent Array
		int []number= {34,56,67,78};
		System.out.println(number[3]);
		System.out.println(number[0]);

	}

}

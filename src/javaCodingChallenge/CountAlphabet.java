package javaCodingChallenge;

public class CountAlphabet {

	public static void main(String[] args) {
		String s ="Inaya Aubrey Rahman";
		int count=0;
		for(int i=0;i<s.length(); i++) {
			if(s.toLowerCase().charAt(i)=='a'){
				count++;
			}
			else if(s.toUpperCase().charAt(i)=='Y') {
				count++;}
			}
		System.out.println(count);
		
			
		
		
	}

}

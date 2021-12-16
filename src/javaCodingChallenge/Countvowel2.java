package javaCodingChallenge;

public class Countvowel2 {

	public static void main(String[] args) {
		String s = "pack my box with five dozen liquor jugs";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}

		}
		System.out.println(count);
	}

}

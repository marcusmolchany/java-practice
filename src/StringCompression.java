import java.util.*;

public class StringCompression {

	public static void main (String [] args) {
		System.out.println("aabcccccaaa compressed is: " + stringCompression("aabcccccaaa"));
	}
	
	public static String stringCompression(String s) {
		if (s.length() <= 1) { // cannot compress string of size 1 or 0
			return s;
		}
		
		String compressedString = s.substring(0,1);
		String currentCharacter = s.substring(0,1);
		int compressionCount = 1; // 0 or 1?
		
		for (int i = 1; i < s.length(); i++) {
			if (i == s.length() - 1) {
				compressionCount++;
				compressedString += "" + compressionCount;
			}
			if (currentCharacter.equals(s.substring(i,i+1))) {
				compressionCount++;
			} else {
				compressedString += ""  + compressionCount;
				compressionCount = 1;
				currentCharacter = s.substring(i,i+1);
				compressedString += currentCharacter;
			}
		}
		return compressedString;
	}
}

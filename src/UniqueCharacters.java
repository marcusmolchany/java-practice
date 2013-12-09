import java.util.*;
import java.lang.*;

public class UniqueCharacters {
	public static void main (String [] args) {
		System.out.println("abcdef: " + isStringUnique("abcdef"));
		System.out.println("abcdeff: " + isStringUnique("abcdeff"));
	}
	
	public static boolean isStringUnique(String s) {
		String [] characters = new String[s.length()];
		characters = s.split("");
		
		HashMap<String, Integer> characterOccuranceMap = new HashMap<String, Integer>();
		
		for (String character: characters) {
			try {
				characterOccuranceMap.put(character, characterOccuranceMap.get(character) + 1);
			} catch (NullPointerException e) {
				characterOccuranceMap.put(character, 1);
			}
		}
		
		for (int value: characterOccuranceMap.values()) {
			if (value > 1) {
				return false;
			}
		}
		return true;
	}
}

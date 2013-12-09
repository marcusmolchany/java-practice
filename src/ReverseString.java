import java.util.*;

public class ReverseString {

	public static void main(String [] args) {
		System.out.println("String abcdefg reversed is " + reverseString("abcdefg"));
	}
	
	public static String reverseString(String s) {
		String reverseString = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reverseString = reverseString + s.substring(i, i+1);
		}
		
		return reverseString;
	}
}

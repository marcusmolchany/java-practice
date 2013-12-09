import java.util.*;

public class Permutation {

	public static void main (String [] args) {
		System.out.println("bac permuation of abc: " + isPermutation("bac", "abc"));
		System.out.println("bacc permuation of abc: " + isPermutation("bacc", "abc"));
	}
	
	public static boolean isPermutation(String s1, String s2) {
		ArrayList<String> s1AL = new ArrayList<String>(Arrays.asList(s1.split("")));
		ArrayList<String> s2AL = new ArrayList<String>(Arrays.asList(s2.split("")));
		
		for (String s:s1AL) {
			if (!s2AL.contains(s)) {
				return false;
			}
			s2AL.remove(s2AL.indexOf(s));
		}
		return s2AL.size() == 0;
	}
}

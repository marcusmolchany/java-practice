
public class MergeSort {

	public static void mergesort(int [] array) {
		int [] helper = new int [array.length];
		mergesort(array, helper, 0, array.length - 1);
	}
	
	public static void mergesort(int [] array, int [] helper, int low, int high) {
		
		// calculate middle of array
		int middle = (high - low) / 2; // integer division so this will give us an int
		
		mergesort(array, helper, low, middle);     //mergesort lower half
		mergesort(array, helper, middle + 1, high); //mergesort upper half
		merge(array, helper, low, high);           //merge
	}
	
	public static void merge(int [] array, int [] helper, int low, int high) {
		// copy values into helper
		int middle = (high - low) / 2;
		int helperLeft = low;
		int helperRight = middle;
		
		// loop through helper to make comparisions and copy into array
		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				// lowest value in left array is lower than lower value in right array
				array[helperLeft] = helper[helperLeft]; // copy lower left value into array
				helperLeft++; // move left pointer in helper forward 1
			} else {
				// lowest value in right array is lower than lower value in left array
				array[helperRight] = helper[helperRight]; // copy lower right value into array
				helperRight++;
			}
		}
		
		// copy remaining elements into array
		int remaining = middle - helperLeft;
		for (int i = 0; i < remaining; i++) {
			array[helperLeft] = helper[helperLeft];
		}
		
	}
	
	public static void printArray(int [] array) {
		for (int i:array) {
			System.out.print(i + " ");
		}
	}
	
	public static void main (String [] args) {
		int [] numbers = {6, 9, 1, 4, 5, 2, 0, 3, 8, 10, 54, 3, 7};
		printArray(numbers);
		mergesort(numbers);
		printArray(numbers);
	}
}

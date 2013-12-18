
public class QuickSort {

	public static void quicksort(int [] array, int left, int right) {

		int pivot = partition(array, left, right);
		
		if (left < pivot) {
			quicksort(array, left, pivot - 1);
		}
		if (pivot < right) {
			quicksort(array, pivot, right);
		}
	}
	
	public static int partition(int [] array, int left, int right) {
		int pivot = array[left + right / 2];
		
		while (array[left] < pivot) {
			left++;
		}
		while (pivot < array[right]) {
			right--;
		}
		
		if (left < right) {
			swap(array, left, right);
			left++;
			right--;
		}
		
		return left;
	}
	
	public static void swap(int [] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
		printArray(array);
	}
	
	public static void printArray(int [] array) {
		for (int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		int [] numbers = {6, 9, 1, 4, 5, 2, 0, 3, 8, 10, 54, 3, 7};
		int left = 0;
		int right = numbers.length - 1;
		
		printArray(numbers);
		quicksort(numbers, left, right);
		printArray(numbers);
	}
}

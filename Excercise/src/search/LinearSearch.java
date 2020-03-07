package search;

public class LinearSearch {

	public static int linearSearch(int arr[], int element) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}

		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		int arr[] = { 23, 12, 0, -10, 29, 45 };
		int element = -100;
		int result = linearSearch(arr, element);
		if (result == Integer.MIN_VALUE) {
			System.out.println("Element " + element + " not found");
		} else {
			System.out.println("Element " + element + " found at index " + result);
		}
	}

}

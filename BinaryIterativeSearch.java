public class BinaryIterativeSearch implements Practice03Search{
	public String searchName() {
		return "Iterative Binary Search";
	}

	public int search(int[] arr, int target){
		int first = 0;
		int last = arr.length -1;

		while (first <= last) {
			int middle = (first + last) / 2;
			if (target < arr[middle]) {
				last = middle - 1;
			}
			if (target > arr[middle]) {
				first = middle + 1;
			}
			if (target == arr[middle]) {
				return middle;
			}
		}
		return -1;
	}
}
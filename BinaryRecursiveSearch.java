public class BinaryRecursiveSearch implements Practice03Search{
	public String searchName() {
		return "Iterative Binary Search";
	}

	public int search(int[] arr, int target){
		int first = 0;
		int last = arr.length-1;
		return searchRec(target, arr, first, last);
	}

	public int searchRec(int target, int[] arr, int first, int last){
		int mid = (first+last)/2;
		if (first < last){
			return -1;
		}
		if (target < arr[mid]){
			return searchRec(target, arr, first, mid-1);
		}
		if (target > arr[mid]){
			return searchRec(target, arr, mid+1, last);
		}
		if (target == arr[mid]){
			return mid;
		}
		return -1;
	}
}
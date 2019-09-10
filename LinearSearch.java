public class LinearSearch implements Practice03Search{
	public String searchName() {
		return "Linear Search";
	}

	public int search(int[] arr, int target){
		for (int i=0; i < arr.length-1; i++){
			if (arr[i] == target){
				return arr[i];
			}
		}
		return -1;
	}
}
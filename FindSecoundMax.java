package leetcodeProblames;

public class FindSecoundMax {

	public static int find(int[] arr) {
		int firstMax = arr[0];
		int secoundMax = 0;
		int thredMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secoundMax=firstMax;
				firstMax = arr[i];
				
			}
			else if (arr[i] >secoundMax) {
				thredMax=secoundMax;
				secoundMax = arr[i];
			}
			else if(arr[i]>thredMax) {
				thredMax=arr[i];
			}
			
		}
		return thredMax;
	}

	public static void main(String[] args) {
		int[] arr = {18, 10, 6, 6, 9, 12, 4, 5, 19, 17, 15 };
		System.out.println(find(arr));
	}

}

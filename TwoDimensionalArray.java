package leetcodeProblames;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static boolean isPalindrom(String str) {
		if (str != null && str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);
			if (start != end) {
				return false;
			}
		}
		return true;
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int current = arr[i] - 1;
			if (arr[i] != arr[current]) {
				swap(arr, i, current);
			} else {
				i++;
			}
		}

	}

	public static void insersionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int end = arr.length - 1 - i;
			int maxIndex = getMax(arr, 0, end);
			swap(arr, maxIndex, end);
		}
	}

	private static void swap(int[] arr, int maxIndex, int end) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[end];
		arr[end] = temp;

	}

	private static int getMax(int[] arr, int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (max < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	public static void babbulSort(int[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 1, 4 };
		// babbulSort(arr);
		// selectionSort(arr);
		insersionSort(arr);
		// cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(isPalindrom("madam"));

	}
//	public static int[] matrixArray(int[][] matrix, int target) {
//		int start = 0;
//		int end = matrix.length - 1;
//
//		while (start < matrix.length && end >=0) {
//			if (matrix[start][end] == target) {
//				return new int[] { start, end };
//			} else if (matrix[start][end] < target) {
//				start++;
//			} else {
//				end--;
//			}
//		}
//		return new int[] { -1, -1 };
//	}
//
//	public static void main(String[] args) {
//		int[][] array = { { 10, 13, 14, 17 }, { 20, 25, 28, 29 }, { 30, 35, 40, 56 }, { 41, 58, 90, 91 } };
//		
//		System.out.println(Arrays.toString(matrixArray(array, 58)));
//
//	}

//	static int col;
//	String bn = "bnayak";
//	
//
//	public static int orderAgnosticBs(String[] arr, String target) {
//		int start = 0, end = arr.length - 1;
//		int isAsc = arr[start].compareTo(arr[ end]);
//		while(start<=end) {
//			int mid= start+(end-start)/2;
//			if(arr[mid].equals(target)) {
//				return mid;
//			}
//			if(isAsc<0) {
//				if(target.compareTo(arr[mid])>0)
//					start=mid=1;
//				else
//					end=mid-1;	
//		}
//			else {
//				if(target.compareTo(arr[mid])<0)
//					start=mid=1;
//				else
//					end=mid-1;
//				
//			}
//		}
//		return -1;
//		 
//			
//			
//	}
//public static void main(String arg[]){
//int[] arr={100,-200,-300,-2000,-10000};
//System.out.println(orderAgnosticBs(arr,-2000));
//
//}

//	public static void main(String[] args) {
//		String[] arr = { "dd","cc","bb","aa" };
//		System.out.println(orderAgnosticBs(arr, "bb"));
//	}
//		List<Integer> asList = Arrays.asList(1,4, 5,7, 9,10);
//		System.out.println(asList);
//		int startIndex=0 ,endIndex=asList.size()-1;
//		
//		while(startIndex<endIndex) {
//		swap(asList, startIndex, endIndex);
//		startIndex++;
//		endIndex--;
//		
//		}
//		System.out.println(asList);
//		Scanner scanner =new Scanner(System.in);
//		ArrayList<ArrayList<Integer>> arrayList= new ArrayList<>();
//		for(int i=0;i<=1;i++) {
//			arrayList.add(new ArrayList<>());
//			
//		}
//		for(int i=0;i<=1;i++) {
//			for(int j=0;j<2;j++)
//			 arrayList.get(i).add(scanner.nextInt());
//		}
//		System.out.println(arrayList);
//		
//		
//		
//		
//		
//String [][] str= {{"a","b","c"},{"a"}};
////		Scanner sc= new Scanner(System.in);
////		System.out.println("entet the values");
////		
////		int[][] arr2d= new int[3][2];
////		for(int i=0;i<arr2d.length;i++) {
////			
////			for(int j=0;j<col;j++) {
////				arr2d[i][j]= sc.nextInt();
////				
////			}
////		}
//		for(int i=0;i<str.length;i++) {
//			for(int j=0;j<str[i].length;j++) {
//				System.out.print(str[i][j]);
//				
//			}
//			System.out.println();
//		
//		}
////
////		for(int i=0;i<str.length;i++) {
////			System.out.println(Arrays.toString(str[i]));
////		}
//		for(String [] i:str) {
//			System.out.println(Arrays.toString(i));
//		}
//
//	}
//	private static void swap(List<Integer> asList, int startIndex, int endIndex) {
//	int tem=asList.get(startIndex);
//	asList.set(startIndex, asList.get(endIndex));
//	asList.set(endIndex, tem);
//			
//	}

}

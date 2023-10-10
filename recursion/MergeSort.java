package leetcodeProblames.recursion;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 10, 02, 504, 3,445, 7, 912, 3 ,10,11};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;
		int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] arr2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(arr1, arr2);
      
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				merge[k] = arr1[i];

				i++;

			} else {
				merge[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			merge[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			merge[k] = arr2[j];
			j++;
			k++;
		}
		return merge;
	}

}

package leetcodeProblames.recursion;

import java.util.Scanner;

public class ManinRunner {
	public static void main(String[] args) {
		CreateTree createTree = new CreateTree();
		Scanner sc = new Scanner(System.in);
		createTree.populete(sc);
		createTree.display();
		
	}
//		int[] arr = { 2, 4, 6, 3, 2, 4, 6 };
//		System.out.println(findUniqu(arr));
//		if (evenOrOdd(112))
//			System.out.println("Odd");
//		else
//			System.out.println("Even");
//	}

	private static boolean evenOrOdd(int num) {
		return (1 & num) == 1;

	}

	private static int findUniqu(int[] arr) {
		int uniqu = 0;
		for (int i : arr) {
			uniqu = uniqu ^ i;

		}
		return uniqu;
	}

}

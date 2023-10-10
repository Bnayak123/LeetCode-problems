package leetcodeProblames.recursion;

import java.util.ArrayList;

public class Fibonacci {
	public static int fibroUsingIterative(int num) {
		if (num < 2) {
			return num;
		}

		int a = 0;
		int b = 1;
		int ans = 0;
		for (int i = 2; i <= num; i++) {
			ans = a + b;
			a = b;
			b = ans;
		}
		return ans;

	}

	public static int fiboUsingRecursion(int num) {
		if (num < 2) {
			return num;
		}
		return fiboUsingRecursion(num - 1) + fiboUsingRecursion(num - 2);
	}
	
	
	public static int factorial(int num) {
		if(num<=1) {
			return 1;
		}
		return num*factorial(num-1);
	}
	
	public static int sumOfTheDigites(int num) {
		if(num==0) {
			return 0;
		}
		
		return num%10+ sumOfTheDigites(num/10);
	}
	public static int prodectOfTheDigites(int num) {
		if(num%10==num) {
			return num;
		}
		
		return num%10* sumOfTheDigites(num/10);
	}
	public static boolean isSorted(int [] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}
		return arr[i]<arr[i+1] && isSorted(arr,i+1);
	}
	public static ArrayList<Integer> fun(int [] arr, int target,int i){
		ArrayList<Integer> list = new ArrayList<Integer> ();
		if(i==arr.length) {
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		ArrayList<Integer> fun = fun(arr, target, i+1);
		list.addAll(fun);
		return list;
	}
	
	//Avoiding to create multiple object of the arrayList
	static ArrayList<Integer> list = new ArrayList<Integer> ();
	public static ArrayList<Integer> fun2(int [] arr, int target,int i){
		
		if(i==arr.length) {
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		ArrayList<Integer> fun = fun(arr, target, i+1);
		list.addAll(fun);
		return list;
	}
	
	

	public static void main(String[] args) {
		//System.out.println(fiboUsingRecursion(4));
		//System.out.println(fibroUsingIterative(7));
		//System.out.println(factorial(5));
		//System.out.println(sumOfTheDigites(1234));
		//System.out.println(prodectOfTheDigites(1234));
		int[] arr= {1,3,9,6,9};
		//System.out.println(isSorted(arr, 0));
		System.out.println(fun2(arr, 9, 0));
	 
		
	}

}

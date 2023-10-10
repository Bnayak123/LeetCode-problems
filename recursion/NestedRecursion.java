package leetcodeProblames.recursion;

public class NestedRecursion {

	public static void main(String[] args) {
		System.out.println(fun(10));
		
	}

	private static int fun(int i) {
		if(i>100) {
			return i-10;
		}
		else {
		return	fun(fun(i+11));
		}
		
		
	}
	

}

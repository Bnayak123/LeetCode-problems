package recursion;

public class IndirectRecursion {
	public static void main(String[] args) {
		funA(20);
	}

	static void  funA(int num) {
		if(num>0) {
			System.out.println(num);
			funB(num-1);
		}
	}

	private static void funB(int i) {
		if(i>1) {
			System.out.println(i);
			funA(i/2);
		}
		
	}

}

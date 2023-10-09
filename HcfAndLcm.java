package leetcodeProblames;

public class HcfAndLcm {
	public static void main(String[] args) {
		System.out.println(hCF(2, 7));
		System.out.println(lcm(2, 7));
	}

	public static int hCF(int a, int b) {
		int gcd = 1;
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	}
	
	
	public static int lcm(int a,int b) {
		return a*b/hCF(a, b);
	}
	
	
	

}

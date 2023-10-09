package leetcodeProblames;

public class FindSqureRoot {

	public static void main(String[] args) {
		int num = 40;
		int p = 3;// how many presidency
		System.out.println(rqureRoot(p, num));
		System.out.println(0.1/10);
	}

	private static double rqureRoot(int p, int num) {
		double root = 0.0;
		int s = 0;
		int e = num;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid * mid == num) {
				return mid;
			}
			if (mid * mid > num) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		double inc = 0.1;
		for (int i = 0; i < p; i++) {
			while (root * root <= num) {
				root += inc;

			}
			root -= inc;// 
			inc /= 10;
		}

		return root;
	}

}

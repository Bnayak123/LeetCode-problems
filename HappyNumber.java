package leetcodeProblames;

public class HappyNumber {
	public static void main(String[] args) {
		
		System.out.println(happyNumber(12));
	}

	public static boolean happyNumber(int num) {
		int slow = num;
		int fast = num;
		do {
			slow = findSqure(slow);
			fast = findSqure(findSqure(fast));
		} while (slow != fast);
		return slow==1;
		
	}

	private static int findSqure(int slow) {
		int ans=0;
		while(slow!=0) {
			int rem= slow%10;
			ans+=rem*rem;
			slow=slow/10;
			
		}
		return ans;
	}
}

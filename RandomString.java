package leetcodeProblames;

import java.util.Random;

public class RandomString {

	public static String random(int size) {
		StringBuffer sb = new StringBuffer(size);
		for (int i = 0; i <= size; i++) {
			Random random = new Random();
			int nextInt = 97 + (int) (random.nextFloat() * 26);
			sb.append((char) nextInt);
		}
		return sb.toString();

	}
	public static long phone() {
		Random random= new Random();
		StringBuffer sb = new StringBuffer(10);
		for(int i=0;i<10;i++) {
		long l=(int)(random.nextFloat()*10);
		sb.append(l);
		}
		return Long.parseLong(sb.toString());
	}

	public static void main(String[] args) {

		System.out.println(random(10));
		
		System.out.println(phone());

	}

}

package recursion;

public class TreeRecursion {

	static void fun(int num) {
		if(num>0) {
			System.out.println(num);
			fun(num-1);
			fun(num-1);
		}
	}
	public static void main(String[] args) {
		fun(3);
	}
	
	
	

}

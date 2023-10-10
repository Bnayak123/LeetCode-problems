package stack_and_queues;

public class StackProblams {
	
	// static variables are shear the copy of the memory for all instance of the class 
	static int num;	
	int i;
	public void show() {
		System.out.println(num+1);
		System.out.println(i+1);
	}
	
	  
	public static void main(String[] args) throws Exception {
		
		StackProblams problams= new StackProblams();
		problams.i=10;
		problams.num=5;
		StackProblams problams2= new StackProblams();
		problams2.i=20;
		problams2.num=3;
		problams.show();
		problams2.show();
		System.out.println(problams.i +" "+ problams.num);
		System.out.println(problams2.i +" "+ problams2.num);
		
		
		//Stack< Integer> stack= new Stack<>();
//		CustomStack stack= new CustomStack(5);
//		stack.push(10);
//		stack.push(20);
//		stack.push(22);
//		stack.push(55);	
//		stack.push(33);
//		stack.push(66);
//		
//		System.out.println(stack.peek());
//		
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		//System.out.println(stack.peek());
		
//		System.out.println(num+1);
//		num=4;
//		System.out.println(num+1);
		
		
	}

	
	
	
}

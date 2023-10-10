package leetcodeProblames.stack_and_queues;

public class CustomStack {

	protected int[] data;
	private final static int DEFULT_SIZE = 10;
	protected int ptr = -1;

	public CustomStack() {
		this(DEFULT_SIZE);
	}

	public CustomStack(int size) {
		data = new int[size];

	}

	public boolean push(int value) throws Exception {
		if (isFull()) {
			return false;
		}

		ptr++;
		data[ptr] = value;
		return true;
	}

	protected boolean isFull() {
		return ptr == data.length - 1;
	}

	public int pop() throws Exception {
		if (Empty()) {
			throw new Exception("Stack is Empty");
		}
		data[ptr] = 0;
		return this.data[ptr--];
	}

	private boolean Empty() {
		return ptr == -1;
	}

	public int peek() throws Exception {
		if (Empty()) {
			throw new Exception("No eliment in Peek or stack is Empty");
		}
		return data[ptr];
	}

	

}
